package recursion.rabbitProblem.hannuota;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/8/6 0006
 */
public class Main {
    public static String countSum(int n){
        DecimalFormat df = new DecimalFormat("0.0000");
        if (n<=0 || n>100){
            return "0.0000";
        }else {
            return df.format(countSum(n-1)+(1/(5*(2*n-1))-(1/5*2*n)));
        }
    }
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        while (sn.hasNextInt()){
            int n = sn.nextInt();
            String res = countSum(n);
            System.out.println(res);
        }
    }
}
