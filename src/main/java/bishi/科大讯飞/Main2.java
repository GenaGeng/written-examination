package bishi.科大讯飞;

import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/8/15 0015
 */
public class Main2 {
    public static int getMaxJi(int[][] A){
        int ji = 1;
        for (int i=0;i<A.length;i++){
            for (int j =0;j<A[i].length;j++){
                for (int k =0;k<A.length;k++){
                    for (int l = 0;l<A[k].length;l++){
                        if (k!=i && l!=j){
                            if (ji < A[i][j] * A[k][l]) {
                                ji = A[i][j] * A[k][l];
                            }
                        }
                    }
                }
            }
        }
        return ji;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] A = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                A[i][j]=sc.nextInt();
            }
        }
        int max = getMaxJi(A);
        System.out.println(max);
    }
}
