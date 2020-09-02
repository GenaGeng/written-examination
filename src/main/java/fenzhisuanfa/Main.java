package fenzhisuanfa;

import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/8/8 0008
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n=scanner.nextInt();
            int[] a = new int[n];
            for (int i=0;i<n;i++){
                a[i] = scanner.nextInt();
            }
        }
    }
}
