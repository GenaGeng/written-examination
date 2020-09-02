package Interview.lecode;

import java.util.HashMap;

/**
 * @author Gena
 * @description 滑动窗口，
 * @date 2020/7/21 0021
 */
public class Lecode3 {
    public int getMaxLen(String s){
//        int maxLen = 0;
//        int  start = 0;
//
//        HashMap<Character,Integer> hashMap = new HashMap<>();
//
//        for (int i =0;i<s.length();i++){
//            if (hashMap.containsKey(s.charAt(i))){
//                start = Math.max(start, hashMap.get(s.charAt(i))+1);
//            }
//            hashMap.put(s.charAt(i),i);
//            maxLen = Math.max(maxLen, i-start+1);
//        }
//        return maxLen;
        int maxLen = 0;

        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        int start = 0;
//        int left = 0;

        if (s.length() == 0){
            return 0;
        }
        for (int i = 0 ; i < s.length(); i ++){
            if (hashMap.containsKey(s.charAt(i))){
                start = Math.max(start,hashMap.get(s.charAt(i))+1);
            }
            hashMap.put(s.charAt(i),i);
            maxLen = Math.max(maxLen,i-start+1);
        }
        return maxLen;
    }
}
