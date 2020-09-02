package bishi.wangyi;

/**
 * @author Gena
 * @description
 * @date 2020/8/8 0008
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = getShorest(s);
        System.out.println(str);
    }
    public static String getShorest(String s){
        int j = s.length()-1;
        for (int i =0;i<s.length();i++){

            if (s.charAt(i) == s.charAt(j)){
                j--;
            }
        }
        if (j==-1){
            return s;
        }

        return s.substring(0,j+1) + getShorest(s.substring(j+1)) + reverse(s.substring(0,j+1));
    }
    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }
}