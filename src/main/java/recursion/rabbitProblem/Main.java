package recursion.rabbitProblem;

/**
 * @author Gena
 * @description
 * @date 2020/8/1 0001
 */
public class Main {
    public static int totalNum(int n){
        if (n==1){
            return 1;
        }else if (n==2){
            return 2;
        }else {
            return totalNum(n - 1) + totalNum(n - 2);
        }
    }

    public static int bigRabbitsNum(int n){
        if (n==1 || n==2){
            return 1;
        }else {
            return bigRabbitsNum(n-1)+bigRabbitsNum(n-2);
        }
    }

    public static void main(String[] args){
        int sum = totalNum(12);
        System.out.println(sum);
        int big = bigRabbitsNum(12);
        System.out.println(big);
    }
}
