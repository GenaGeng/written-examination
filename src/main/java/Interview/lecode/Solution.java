package Interview.lecode;

/**
 * @author Gena
 * @description
 * @date 2020/7/12 0012
 */
// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] strs = new String[n];
        for(int i=0; i<n; i++) {
            strs[i] = in.next();
        }
        int res = 0;
        boolean[] flag = new boolean[n];
        for(int i=0; i<n && (flag[i] == false); i++){
            int max = 0;
            int[] biaoben = new int[26];
            for(char c : strs[i].toCharArray()){
                biaoben[c-'a']++;
            }
            for(int j=i; j<n; j++){
                int[] zheyige = new int[26];
                for(char c : strs[j].toCharArray()){
                    zheyige[c-'a']++;
                }
                boolean biaozhi = true;
                for(int k=0; k<26; k++){
                    if(biaoben[k] != zheyige[k]){
                        biaozhi = false;
                    }
                }
                if(biaozhi == true){
                    System.out.println(j);
                    max++;
                    flag[j] = true;
                }
            }
            if(max > res){
                res = max;
            }
        }
        System.out.println(res);
    }
}



//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        String[] strs = new String[n];
//        for(int i=0; i<n; i++) {
//            strs[i] = in.next();
//        }
//        int res = 0;
//        for(int i=0; i<n; i++){
//            int max = n-i;
//            int[] biaoben = new int[26];
//            for(char c : strs[i].toCharArray()){
//                biaoben[c-'a']++;
//            }
//            for(int j=i; j<n; j++){
//                int[] zheyige = new int[26];
//                for(char c : strs[j].toCharArray()){
//                    zheyige[c-'a']++;
//                }
//                for(int k=0; k<26; k++){
//                    if(biaoben[k] != zheyige[k]){
//                        max --;
//                        break;
//                    }
//                }
//            }
//            if(max > res){
//                res = max;
//            }
//        }
//        System.out.println(res);
//    }
//}