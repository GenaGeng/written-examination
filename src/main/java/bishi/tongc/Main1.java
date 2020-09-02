package bishi.tongc;

import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/8/31 0031
 */
public class Main1 {

    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int top = sn.nextInt();
        int n = sn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

                arr[i] = sn.nextInt();

            System.out.println(arr[i]);
        }

        solution(arr,top);
    }

    public static void solution(int[] arr,int top){
        int max = 0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        for (int i = 0;i<arr.length;i++){
            for (int j=1;j<= top;j++ ){
                if (arr[i]+j>max){
                    System.out.println(arr[i]+j);
                    break;
                }
            }
        }
    }
}
