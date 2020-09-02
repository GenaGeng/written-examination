package bishi.京东;

import java.text.DecimalFormat;

import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/8/6 0006
 */
public class Main {
    public static String countTime(double x,double y,double[][] arr,int n){
        DecimalFormat df = new DecimalFormat("0.00");
        double[] len =new double[arr.length];
        for (int i=0;i<arr.length;i++){
            len[i] = Math.sqrt(Math.pow((x-arr[i][0]),2) + Math.pow((y-arr[i][1]),2));
        }
        double minLen = getMin(len);

        double time = minLen / n;

        String ti = df.format(time);
        return ti;
    }
    public static double getMin(double[] arr){
        double min = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        while (sn.hasNext()){
            int n = sn.nextInt();
            int m = sn.nextInt();
            double x = sn.nextDouble();
            double y = sn.nextDouble();
            double[][] arr = new double[m][2];
            for (int i=0;i<m;i++){
                arr[i][0] = sn.nextDouble();
                arr[i][1] = sn.nextDouble();
            }
            System.out.println(n+" "+ m+""+" "+x+" "+y );
            for (int j=0;j<arr.length;j++){
                System.out.println(arr[j][0] +" "+arr[j][1]);
            }
            String time = countTime(x,y,arr,n);
            System.out.println(time);
        }

    }
}
