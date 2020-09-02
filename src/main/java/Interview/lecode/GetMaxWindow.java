package Interview.lecode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/6/13 0013
 */
public class GetMaxWindow {
    public int[] getMaxWindow(int arr[], int w){
        if (arr.length==0 || w == 0 || arr.length < w){
            return null;
        }

        LinkedList<Integer> mque = new LinkedList<Integer>();

        int[] res = new int[arr.length - w +1];
        int index = 0;

        for (int i = 0; i < arr.length;i++){
            while (!mque.isEmpty() && arr[mque.peekLast()] <= arr[i]){
                mque.pollLast();
            }
            mque.addLast(i);
            if (mque.peekFirst() == i -w){
                mque.pollFirst();
            }
            if (i >= w -1){
                res[index++] = arr[mque.peekFirst()];
            }
        }
        return res;
    }

    public int[] parseToStringArry(String s){
        if(s.isEmpty()){
            System.out.println("数组为空");
        }

        String[] strArr = s.split(" ");

        int[] intArr = new int[strArr.length];

        for (int i =0;i<strArr.length;i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    public static void main(String[] args){
        System.out.println("请输入数组和窗口大小，用逗号隔开");
        Scanner sn = new Scanner(System.in);
        String line = sn.nextLine();
        String arry = line.substring(0,line.indexOf(","));
        String window = line.substring(arry.length()+1,line.length());
        GetMaxWindow gMW = new GetMaxWindow();
        int[] arr = gMW.parseToStringArry(arry);
        System.out.println(Arrays.toString(arr));

        int[] res = gMW.getMaxWindow(arr,Integer.parseInt(window));
        System.out.println(Arrays.toString(res));

    }
}
