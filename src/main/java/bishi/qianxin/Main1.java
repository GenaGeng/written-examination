package bishi.qianxin;

/**
 * @author Gena
 * @description
 * @date 2020/9/2 0002
 */

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = upStair(n);
        System.out.println(num);
    }

    public static int upStair(int n){
        if (n<=2){
            return n;
        }
        int x=1;
        int y=2;
        int z=0;

        for (int i =3;i<=n;i++){
            z = x+y;
            x=y;
            y=z;
        }
        return z;
    }
}
