package Interview.lecode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/7/18 0018
 */
public class Lecode1 {
    public static int[] twoSum(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[j]==target-nums[i]){
//                    return new int[] {i,j};
//                }
//            }
//        }
//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        for (int i = 0;i<nums.length;i++){
//            hashMap.put(nums[i],i);
//        }
//        for (int i=0;i<nums.length;i++){
//            int cha = target-nums[i];
//            if (hashMap.containsKey(cha)&&hashMap.get(cha)!=i){
//                return new int[]{i,hashMap.get(cha)};
//            }
//        }
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i=0;i<nums.length;i++){
//            int cha = target-nums[i];
//            if (map.containsKey(cha)&&map.get(cha)!=i){
//                return new int[]{i,map.get(cha)};
//            }
//            map.put(nums[i],i);
//        }
//        throw new IllegalArgumentException("no sum solution");
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        for (int i =0;i<nums.length;i++){
            int count = target - nums[i];
            if (hashMap.containsKey(count) && hashMap.get(count) != i){
                return new int[]{i,hashMap.get(count)};
            }
            hashMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("no such num");
    }

    public static void main(String[] args){
        System.out.println("输入。。。。。");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(",");
        String[] num = s1[0].split(" ");
        int[] nums = new int[num.length];
        for (int i=0;i<num.length;i++){
            nums[i]=Integer.valueOf(num[i]);
        }
        twoSum(nums,Integer.valueOf(s1[1]));
    }
}
