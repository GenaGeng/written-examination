package Interview.lecode;

/**
 * @author Gena
 * @description
 * @date 2020/7/22 0022
 */
public class Lecode4 {
    public double getMidNum(int[] nums1,int[] nums2){
//        int len1 = nums1.length;
//        int len2 = nums2.length;
//        int totalLength = len1 + len2;
//
//        if (totalLength%2==0){
//            int mid = totalLength/2;
//            double midNum = (getKminnum(nums1,nums2,mid)+getKminnum(nums1,nums2,mid+1));
//            return midNum;
//        }else {
//            int mid = totalLength/2;
//            double midNum = getKminnum(nums1,nums2,mid+1);
//            return midNum;
//        }
//    }
//
//    public int getKminnum(int[] nums1,int[] nums2,int k){
//        int len1 = nums1.length;
//        int len2 = nums2.length;
//
//        int index1 = 0;
//        int index2 = 0;
//
//        while (true){
//            if (index1 == len1){
//                return nums2[index2+k-1];
//            }
//            if (index2 == len2){
//                return nums1[index1+k-1];
//            }
//            if (k==1){
//                return Math.min(nums1[index1],nums2[index2]);
//            }
//
//            int half = k/2;
//
//            int newindex1 = Math.min(index1+half,len1)-1;
//            int newindex2 = Math.min(index2+half,len2)-1;
//
//            int p1 = nums1[newindex1];
//            int p2 = nums2[newindex2];
//
//            if (p1<=p2){
//                k-=(newindex1-index1+1);
//                index1 = newindex1+1;
//            }else {
//                k-=(newindex2-index2+1);
//                index2 = newindex2+1;
//            }
//        }

        int len1 = nums1.length;
        int len2 = nums2.length;
        int totallen = len1 +len2;

        int mid = totallen / 2;

        /**
         * 如果两个数组长度加起来是偶数，返回两个数组的第mid小和第mid+1小的两数的平均数，否则返回两个数组的第mid+1小
         */
        if (totallen % 2 ==0){
            return (getKthMin(nums1,nums2,mid) + getKthMin(nums1,nums2,mid+1))/2.0;
        }else {
            return getKthMin(nums1,nums2,mid+1);
        }
    }
    public double getKthMin(int[] nums1,int[] nums2,int k) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int index1 = 0;
        int index2 = 0;

        while (true) {
            /**
             * 如果nums1为空，返回nums2的第k个元素
             */
            if (index1 == len1) {
                return nums2[index2 + k - 1];
            }
            if (index2 == len2) {
                return nums1[index1 + k - 1];
            }

            /**
             * 如果k为1，返回两个数组第一个元素最小的那个数
             */
            if (k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }

            //取k/2
            int half = k / 2;

            //取index开始数后第k/2个元素
            int newIndex1 = Math.min(index1 + half, len1) - 1;
            int newIndex2 = Math.min(index2 + half, len2) - 1;

            int p1 = nums1[newIndex1];
            int p2 = nums2[newIndex2];

            //如果nums1的k/2比nums2的k/2小，移除nums1的前k/2个元素，否则移除nums2的前k/2个元素
            if (p1 <= p2) {
                k -= newIndex1 - index1 + 1;
                index1 = newIndex1 + 1;
            } else {
                k -= newIndex2 - index2 + 1;
                index2 = newIndex2 + 1;
            }
        }


    }
}
