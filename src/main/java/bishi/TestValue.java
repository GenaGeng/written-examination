package bishi;

/**
 * @author Gena
 * @description
 * @date 2020/8/3 0003
 */
public class TestValue {
    public static void main(String[] args){
        TestValue t = new TestValue();
        t.first();
    }

    public void first(){
        int i = 5;
        Value v = new Value();
        v.i =25;
        second(v,i);
        System.out.println(v.i + " " + i);
    }

    public void second(Value v,int i){
        i = 0;
//        v.i=20;
        Value val = new Value();
        v=val;
        System.out.println(v.i +" " +i);
    }
}
