package bishi.aiqiyi;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/8/23 0023
 */
public class Main1 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        System.out.println(n);

        System.out.println(CountZero(n));
    }
    public static int CountZero(int n){
        int count=0;
        BigInteger sum = new BigInteger(String.valueOf(1));

        for (int j =1;j<=n;j++){
            BigInteger j_value = new BigInteger(String.valueOf(j));
            sum = sum.multiply(j_value);
        }
        String str = sum.toString();
        for (int i=str.length()-1;i>=0;i--){
            if (str.charAt(i)=='0'){
                count++;
            }else {
                break;
            }
        }
        return count;
    }


}
