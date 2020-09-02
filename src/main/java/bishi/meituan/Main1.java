package bishi.meituan;

import java.util.*;

/**
 * @author Gena
 * @description
 * @date 2020/8/15 0015
 */
public class Main1 {
    public static int getNiXuShu(int x){
        int num = 0;
        int y;
        while (x!=0){
            y = x % 10;
            x = x / 10;
            num = num * 10 + y;
        }
        return num;
    }

    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1;i<=n;i++){
            if (i * 4 == getNiXuShu(i)){

                count++;
                list.add(i);
            }
        }
        System.out.println(count);
        for (int j =0;j<list.size();j++){
            System.out.println(list.get(j) +" "+ list.get(j)*4);
        }
    }
}
