package bishi.科大讯飞;

import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/8/15 0015
 */
public class Main5 {
    public static String getNewString(String str,int n){
        String newstr = null;
        if (n<=str.length()){
            newstr = str.substring(n) + str.substring(0, n);
        }else {
            n=n-str.length();
            getNewString(str,n);
        }
        return newstr;
    }
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        String str = sn.nextLine();
        int n = sn.nextInt();
        String string = getNewString(str,n);
        System.out.println(string);

    }
}
