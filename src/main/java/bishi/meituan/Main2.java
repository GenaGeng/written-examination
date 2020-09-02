package bishi.meituan;

import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2020/8/15 0015
 */
public class Main2 {
    public static int getTravelNum(String[] city){
        int count =0;
        String start = city[0];
        for (int i =1;i<city.length;i++){
            if (start.equals(city[i])){
                count++;
                start = city[i+1];
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        String[] city = new String[n*2];
        for (int j =0;j<n;j+=2) {
            while (sn.hasNext()) {
                String[] record = sn.nextLine().split(" ");
                city[j] = record[0];
                city[j+1] = record[1];
            }
        }
        int count = getTravelNum(city);
        System.out.println(count);
    }
}
