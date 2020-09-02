package Interview.lecode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Gena
 * @description
 * @date 2020/6/22 0022
 */
public class getLongSubString {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                start = Math.max(start, map.get(s.charAt(i)));
            }
            map.put(s.charAt(i),i);

            if (s.charAt(i) == 'q'){}
            maxlen = Math.max(maxlen, i-start+1);
        }
        ArrayList<Integer> arrayList = new ArrayList<>(map.values());
        return maxlen;
    }
}
