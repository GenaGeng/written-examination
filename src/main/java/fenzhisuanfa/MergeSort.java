package fenzhisuanfa;

/**
 * @author Gena
 * @description
 * @date 2020/8/1 0001
 */
public class MergeSort {

    public static int count=0;

    /**
     *     将两个数组归并到一起
     */
    public static void merge(int[] arr,int left,int center,int right){
        //左数组的第一个下标
        int lindex = left;
        //右数组的第一个下标
        int rindex = center+1;
        //新数组的下标
        int index = left;

        //创建一个新数组暂存
        int[] temp = new int[arr.length];

        //如果左右数组都不为空
        while (lindex<=center && rindex <=right){
            //比较对应的元素
            if (arr[lindex] <= arr[rindex]){
                temp[index] = arr[lindex];
                lindex++;
                index++;
            }else {
                temp[index++] = arr[rindex++];
            }
        }

        //如果左数组还有剩余,直接接到新数组后面
        while (lindex<=center){
            temp[index++] = arr[lindex++];
        }

        //如果右数组还有剩余
        while (rindex<=right){
            temp[index++] = arr[rindex];
        }

        //将新数组的值覆盖原数组
        index = left;
        while (index<=right){
            arr[index++] =temp[index++];
        }
    }

    /**
     * 归并排序
     */
    public static void mergeSort(int[] arr,int left,int right){

        if (left>=right){
            return;
        }
        int center = (left +right)/2;
        //分治
        mergeSort(arr,left,center);
        mergeSort(arr,center+1,right);
        //合并
        merge(arr,left,center,right);
        query(arr);
    }

    /**
     * 记录第几次排序
     */
    public static void query(int[] arr){
        System.out.println("第" + count + "次排序：");
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
        count++;
    }

}
