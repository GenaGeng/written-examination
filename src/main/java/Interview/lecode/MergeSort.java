package Interview.lecode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Gena
 * @description 空间复杂度为O(N)的归并排序
 * @date 2020/7/16 0016
 */
public class MergeSort {
    public static int count = 0 ;
    public static void mergeSort(int[] arr,int left,int right){
        if (left>=right){
            return;
        }
        int center = (left + right)/2;
        mergeSort(arr, left, center);
        mergeSort(arr, center+1, right);
        merge(arr,left,center,right);
        //执行一次mergeSort就是一次排序
        query(arr);
    }
    public static void merge(int[] arr,int left,int center,int right){
        int[] t = new int[arr.length];

        int lindex = left;
        int rindex = center+1;
        int index = left;
        while (lindex<=center && rindex<=right){
            if (arr[lindex] <= arr[rindex]){
                t[index] = arr[index];
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
//        System.out.println(Arrays.toString(arr));

    }
    public static void query(int[] data){
        System.out.print("第"+count+"次排序: ");
        count++;
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");

        int[] arr = new int[s1.length];
        for (int i = 0; i < s1.length;i++){

            arr[i] = Integer.valueOf(s1[i]);
        }

        //输出一下原始数组
        query(arr);
        mergeSort(arr,0,arr.length-1);
        query(arr);
    }
}
