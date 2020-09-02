package bishi.科大讯飞;


import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/8/15 0015
 */
public class Main3 {
    public static int count = 0 ;
    public static void mergeSort(int[] arr,int left,int right){
        if (left>=right){
            return;
        }
        int center = (left + right)/2;
        mergeSort(arr, left, center);
        mergeSort(arr, center+1, right);
        merge(arr,left,center,right);
    }
    public static void merge(int[] arr,int left,int center,int right){
        int[] t = new int[arr.length];

        int lindex = left;
        int rindex = center+1;
        int index = left;
        while (lindex<=center && rindex<=right){
            if (arr[lindex] <= arr[rindex]){
                t[index] = arr[lindex];
                index++;
                lindex++;
            }else {
                t[index] = arr[rindex];
                index++;
                rindex++;
            }
        }
        while (lindex<=center){
            t[index] = arr[lindex];
            index++;
            lindex++;
        }
        while (rindex<=right){
            t[index] = arr[rindex];
            index++;
            rindex++;
        }
        index = left;
        while (index<=right){
            arr[index] = t[index];
            index++;
        }

    }
    public static void query(int[] data){

        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }



    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        int n = sn.nextInt();
        int[] arr = new int[n];

        for (int i =0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        mergeSort(arr,0,arr.length-1);
        query(arr);

    }

}
