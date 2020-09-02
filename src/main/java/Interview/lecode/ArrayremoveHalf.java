package Interview.lecode;

import java.util.*;

/**
 * @author Gena
 * @description
 * @date 2020/6/26 0026
 */
public class ArrayremoveHalf {
    public static int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        Set minSet = new HashSet();
        for(int i = 0;i<arr.length;i++){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
        List<Integer> times = new ArrayList<Integer>(map.values());
        Collections.sort(times,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });
        int size = 0;
        int len = 0;
        for(int j : times){
            len = len + j;
            if(len * 2 < arr.length){
                size++;
            }else{
                return size;
            }
        }
        return size;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[1000];
        String string = scanner.nextLine();
        String[] s1 = string.split(",");
        for(int i=0;i<s1.length;i++){
            arr[i] = Integer.valueOf(s1[i]);
        }
        System.out.println(minSetSize(arr));
    }
}
