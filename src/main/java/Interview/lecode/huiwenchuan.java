package Interview.lecode; /**
 * @author GengNing
 * @description: 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。
 *                如何删除才能使得回文串最长呢？输出需要删除的字符个数。
 * @date 2019/4/30 0030
 */
import java.util.*;
public class huiwenchuan{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            System.out.println(str.length()-getResult(str));
        }
    }
    public static int getResult(String str){
        StringBuilder sb  = new StringBuilder(str);
        String newStr = sb.reverse().toString();
        char[] c1 = str.toCharArray();
        char[] c2 = newStr.toCharArray();
        int n = str.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(c1[i-1]==c2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}
