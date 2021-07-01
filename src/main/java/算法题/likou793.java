package 算法题;

/**
 * 793. 阶乘函数后 K 个零
 * f(x) 是 x! 末尾是 0 的数量。（回想一下 x! = 1 * 2 * 3 * ... * x，且 0! = 1 ）
 * 例如， f(3) = 0 ，因为 3! = 6 的末尾没有 0 ；而 f(11) = 2 ，因为 11!= 39916800 末端有 2 个 0 。给定 K，找出多少个非负整数 x ，能满足 f(x) = K 。
 * 示例 1：
 * 输入：K = 0
 * 输出：5
 * 解释：0!, 1!, 2!, 3!, and 4! 均符合 K = 0 的条件。
 * 示例 2：
 * 输入：K = 5
 * 输出：0
 * 解释：没有匹配到这样的 x!，符合 K = 5 的条件。
 * 提示：
 * K 是范围在 [0, 10^9] 的整数。
 */
public class likou793 {
    public static void main(String[] args) {
        likou793 likou = new likou793();
        System.out.println(likou.preimageSizeFZF(1000000000));
    }
    long MAX=1000000000;
    public int preimageSizeFZF(int k) {
        if (k == MAX) return 5;
        return (int) ((int) (right_bound(k) - left_bound(k)) + 1);
    }

    long left_bound(int target) {
        long lo = 0, hi = MAX;
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            long compute = compute(mid);
            if (compute < target)
                lo = mid + 1;
            else if (compute > target)
                hi = mid;
            else
                hi = mid;
        }
        return lo;
    }

    long right_bound(int target) {
        long lo = 0, hi = MAX;
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            long compute = compute(mid);
            if (compute < target)
                lo = mid + 1;
            else if (compute > target)
                hi = mid;
            else
                lo = mid + 1;
        }
        return lo - 1;
    }

    private long compute(long n) {
        long count = 0;
        for (long d = n; d / 5 > 0; d /= 5)
            count += d / 5;
        return count;
    }

    public int preimageSizeFZF2(long K) {
        long lo = K, hi = 10*K + 1;
        while (lo < hi) {
            long mi = lo + (hi - lo) / 2;
            long zmi = zeta(mi);
            if (zmi == K) return 5;
            else if (zmi < K) lo = mi + 1;
            else hi = mi;
        }
        return 0;
    }

    public long zeta(long x) {
        if (x == 0) return 0;
        return x/5 + zeta(x/5);
    }
}
