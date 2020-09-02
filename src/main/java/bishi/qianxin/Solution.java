package bishi.qianxin;

import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/9/2 0002
 */
public class Solution {
   public static int house (int[] person){
       int[] newhouse = new int[person.length];
       int count = 0;
       newhouse[0] = 1;
       for (int j=1;j<person.length;j++){
           if (person[j]>person[j-1]){
               newhouse[j]=newhouse[j-1]+1;
           }else if (person[j]==person[j-1]){
               newhouse[j]=1;
           }else {
               newhouse[j]=newhouse[j-1];
               newhouse[j-1]++;
           }
       }

       for (int i=0;i<newhouse.length;i++){
           count+=newhouse[i];
           System.out.println(newhouse[i]);
       }
       return count;

   }
   public static void main(String[] args){
       Scanner in =new Scanner(System.in);
       String str=in.nextLine();
       String[] strings = str.split(" ");
       int[] person = new int[strings.length];
       for (int i=0;i<strings.length;i++){
           person[i]= Integer.valueOf(strings[i]);
       }
       int num = house(person);
       System.out.println(num);
   }
}
