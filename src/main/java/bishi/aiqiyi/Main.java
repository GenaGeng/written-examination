package bishi.aiqiyi;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Gena
 * @description
 * @date 2020/8/23 0023
 */
public class Main {
    public static boolean isMatch(String string){
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)=='(' || string.charAt(i) == '[' || string.charAt(i)=='{'){
                stack.push(string.charAt(i));
            }else {
                if (stack.isEmpty()){
                    return false;

                }
                char top = stack.pop();
                if (string.charAt(i)==')' && top!='('){
                    return false;
                }
                if (string.charAt(i)==']' && top!='['){
                    return false;
                }
                if (string.charAt(i)=='}' && top!='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        Scanner sn =new Scanner(System.in);
        String str = sn.nextLine();
        System.out.println(isMatch(str));
    }
}
