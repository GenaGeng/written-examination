package bishi.科大讯飞;

import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/8/15 0015
 */
public class Main4 {
    public static int get1Nums(int n){
        int num =0;
        while (n!=0){
            int x = n % 2;
            if (x==1){
                num++;
            }
            n = n / 2;
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sn =new Scanner(System.in);
        int n = sn.nextInt();
        int num = get1Nums(n);
        System.out.println(num);
    }
}
