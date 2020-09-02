package daily;

/**
 * @author Gena
 * @description 一个线程输出1 3 5 7 9另一个线程输出2 4 6 8 10，如何让两个线程运行输出1 2 3 4 5 6 7 8 9 10
 * @date 2020/8/11 0011
 */
public class TwoThreadIntOut {
    //创建一个锁对象来实现两个线程的同步
    private static final Object lok = new Object();
    //打印的数据，初始为1
    private int index = 1;
    //bool类型的hasprint表示一个线程是否已经打印，初始为false
    private boolean hasPrint =false;

    /**
     * 第一个线程，实现大打印1 3 5 7 9
     */
    class Thread1 implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                //获取锁
                synchronized (lok) {
                    //如果线程1已经打印了
                    while (hasPrint) {
                        //锁对象执行wait方法，释放lok锁对象
                        try {
                            lok.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //否则打印
                    System.out.println(index);
                    index++;
                    //置hasprint为true
                    hasPrint = true;
                    //通知其他线程执行
                    lok.notify();
                }
            }

        }
    }

        /**
         * 线程2打印2 4 6 8 10
         */
        class Thread2 implements Runnable{
            @Override
            public void run() {
                for (int i =0;i<=5;i++){
                    //获取锁对象
                    synchronized (lok){
                        //如果线程1没有打印，则执行wait方法，释放lok锁对象
                        while (!hasPrint){
                            try {
                                lok.wait();
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                        //否则线程2打印
                        System.out.println(index);
                        index++;
                        //置hasprint为false
                        hasPrint =false;
                        //通知其他线程
                        lok.notify();
                    }
                }
            }
        }


    public static void main(String[] args){
        TwoThreadIntOut twoThreadIntOut = new TwoThreadIntOut();

        Thread t1 = new Thread(twoThreadIntOut.new Thread1());
        Thread t2 = new Thread(twoThreadIntOut.new Thread2());

        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName());
    }
}
