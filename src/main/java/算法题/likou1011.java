package 算法题;

/**
 * 1011. 在 D 天内送达包裹的能力
 * 传送带上的包裹必须在 D 天内从一个港口运送到另一个港口。
 * <p>
 * 传送带上的第 i 个包裹的重量为 weights[i]。每一天，我们都会按给出重量的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。
 * <p>
 * 返回能在 D 天内将传送带上的所有包裹送达的船的最低运载能力。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：weights = [1,2,3,4,5,6,7,8,9,10], D = 5
 * 输出：15
 * 解释：
 * 船舶最低载重 15 就能够在 5 天内送达所有包裹，如下所示：
 * 第 1 天：1, 2, 3, 4, 5
 * 第 2 天：6, 7
 * 第 3 天：8
 * 第 4 天：9
 * 第 5 天：10
 * <p>
 * 请注意，货物必须按照给定的顺序装运，因此使用载重能力为 14 的船舶并将包装分成 (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) 是不允许的。
 * 示例 2：
 * <p>
 * 输入：weights = [3,2,2,4,1,4], D = 3
 * 输出：6
 * 解释：
 * 船舶最低载重 6 就能够在 3 天内送达所有包裹，如下所示：
 * 第 1 天：3, 2
 * 第 2 天：2, 4
 * 第 3 天：1, 4
 * 示例 3：
 * <p>
 * 输入：weights = [1,2,3,1,1], D = 4
 * 输出：3
 * 解释：
 * 第 1 天：1
 * 第 2 天：2
 * 第 3 天：3
 * 第 4 天：1, 1
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= D <= weights.length <= 50000
 * 1 <= weights[i] <= 500
 */
public class likou1011 {
    public static void main(String[] args) {
        likou1011 likou1011 = new likou1011();
        int[] wei = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(likou1011.shipWithinDays(wei, 5));
    }

    public int shipWithinDays(int[] weights, int D) {
        if (weights.length == 0) return 0;
        if (weights.length == 1 && weights[0] < D) return 1;
        int n = weights.length;
        int left = getMax(weights), right = getSum(weights);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(weights, mid, D)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int getSum(int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        return sum;
    }

    /**
     * 计算是否可以完成
     *
     * @param weights 要运输的数组
     * @param mid     计算出来的当前传送带可以运输的最小weight
     * @param d       规定天数
     * @return
     */
    private boolean canFinish(int[] weights, int mid, int d) {
        int i = 0;
        for (int day = 0; day < d; day++) {
            int maxCap = mid;
            while ((maxCap -= weights[i]) >= 0) {
                i++;
                if (i == weights.length) return true;
            }
        }
        return false;
    }

    private int getMax(int[] weights) {
        int max = 0;
        for (int weight : weights) {
            max = Math.max(weight, max);
        }
        return max;
    }
}
