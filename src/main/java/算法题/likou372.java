package 算法题;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 372. 超级次方
 * 你的任务是计算 ab 对 1337 取模，a 是一个正整数，b 是一个非常大的正整数且会以数组形式给出。
 * 示例 1：
 * 输入：a = 2, b = [3]
 * 输出：8
 * 示例 2：
 * 输入：a = 2, b = [1,0]
 * 输出：1024
 * 示例 3：
 * 输入：a = 1, b = [4,3,3,8,5,2]
 * 输出：1
 * 示例 4：
 * 输入：a = 2147483647, b = [2,0,0]
 * 输出：1198
 */
public class likou372 {
    public static void main(String[] args) {
        likou372 likou = new likou372();
        int[] a = {2, 0, 0};
        System.out.println(likou.superPow(2147483647, a));
        System.out.println((256%15));
        System.out.println((4%15));
        System.out.println(1024%15);
    }

    int base = 1337;

    public int superPow(int a, int[] b) {
        LinkedList<Integer> q = new LinkedList<>();
        for (int i : b) q.offer(i);
        return superPow(a, q);
    }

    public int superPow(int a, LinkedList<Integer> b) {
        if (b.isEmpty()) return 1;
        int last = b.removeLast();
        int part1 = mypow(a, last);
        int part2 = mypow(superPow(a, b), 10);
        return (part1 * part2) % base;
    }

    int mypow(int a, int k) {
        a = a % base;
        int res = 1;
        for (int i = 0; i < k; i++) {
            res *= a;
            res %= base;
        }
        return res;
    }
}
