package Interview.lecode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Gena
 * @description
 * @date 2019/5/13 0013
 */
public class LuckyBag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] balls = new int[n];
            for (int i =0;i<n;i++) {
                balls[i] = scanner.nextInt();
            }
            int luckyBall = getLuckyBall(balls);
            System.out.println(luckyBall);
        }
        scanner.close();
    }

    private static int getLuckyBall(int[] balls) {
        Arrays.sort(balls);
        int count = find(balls,0,0,1);
        return count;
    }

    private static int find(int[] balls, int index, int sum, int multi) {
        int count = 0;
        for (int i = index; i < balls.length; i++) {
            sum += balls[i];
            multi *= balls[i];
            //当前满足要求
            if (sum > multi) {
                count += 1 + find(balls, i + 1, sum, multi);
            }
            //当前数为1，后续说不定可以保证满足要求
            else if (balls[i] == 1) {
                count += find(balls, i + 1, sum, multi);
            } else {
                break;
            }
            // 当前数不满足 那么ball[i+1]
            sum -= balls[i];
            //回溯法 遍历
            multi /= balls[i];
            //去掉重复的集合
            while (i < balls.length - 1 && balls[i] == balls[i + 1]) {
                i++;
            }
        }
        return count;
    }
}
