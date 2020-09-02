package bishi.tongc;

/**
 * @author Gena
 * @description
 * @date 2020/8/31 0031
 */
public class Main {
    public static void main(String[] args){
        boolean flag = false;
        for (int i=1000;i<100000;i++){
            for (int j = 2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    flag = true;
                    break;
                }
            }
            if (flag==false){
                String str = String.valueOf(i);
                final  StringBuilder builder = new StringBuilder(str);
                if (builder.reverse().toString().equals(str)){
                    System.out.println(i);
                }

            }else {
                flag=false;
                continue;
            }
        }

    }
}
