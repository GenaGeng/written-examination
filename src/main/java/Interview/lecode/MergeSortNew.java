package Interview.lecode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/7/16 0016
 */
public class MergeSortNew {
    public static int count = 0;
    public static void merge(int[] arr,int left,int center,int right,int max){
//        int[] t = new int[arr.length];
        int lindex = left;
        int rindex = center+1;
        int index =left;

        while (lindex <= center && rindex<=right){
            if (arr[lindex]%max < arr[rindex]%max){
                arr[index] = arr[index] + (arr[lindex]%max)*max;
                index ++;
                lindex ++;
            }else {
                arr[index] = arr[index] + (arr[rindex]%max)*max;
                index++;
                rindex++;
            }
        }
        while (lindex<=center){
            arr[index] = arr[index] + (arr[lindex]%max) *max;
            index++;
            lindex++;
        }
        while (rindex <= right){
            arr[index] = arr[index] +(arr[rindex]%max)*max;
            index++;
            rindex++;
        }
        for (lindex=left;lindex<=right;lindex++){
            arr[lindex] = arr[lindex] / max;
        }
    }
    public static void query(int[] data){
        System.out.print("第"+count+"次排序: ");
        count++;
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int left, int right, int max){
        if(left>=right){
            return;
        }
        int m = (left+right)/2;
        mergeSort(arr,left,m,max);
        mergeSort(arr,m+1,right,max);
        merge(arr,left,m,right,max);
        query(arr);
    }

    public static void mergeSortt(int[] arr,int left,int right){
        int max = Arrays.stream(arr).max().getAsInt()+1;
        mergeSort(arr,left,right,max);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length];
        for (int i =0;i<s1.length;i++){
            arr[i] = Integer.valueOf(s1[i]);
        }
        query(arr);
        mergeSortt(arr,0,arr.length-1);
        query(arr);
    }
}
