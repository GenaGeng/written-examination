package bishi.广联达;

import java.util.*;

import static java.util.Collections.min;

/**
 * @author Gena
 * @description
 * @date 2020/7/29 0029
 */
public class zhongcao {
    public static int getMinHeight(Integer[] array,int m,int x){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int j =0;j<array.length;j++){
            hashMap.put(array[j],j);
        }
        for (int i =0;i<m;i++){
            int height = Collections.min(Arrays.asList(array));
            int value = hashMap.get(height);
            hashMap.remove(height);
            height += x;
            hashMap.put(height,value);
            array[value] = height;
        }
        return Collections.min(Arrays.asList(array));
    }
    public static void main(String[] args){
        int height =0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int x = scanner.nextInt();

            Integer[] array = new Integer[n];

            for (int i=0;i<n;i++){
                array[i] = scanner.nextInt();
            }

            height=getMinHeight(array,m,x);
            System.out.println(height);
        }

    }
}
