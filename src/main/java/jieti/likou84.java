package jieti;

public class likou84 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 6, 2, 3};
        likou84 likou84 = new likou84();
        int i = likou84.largestRectangleArea(nums);
        System.out.println(i);
    }

    public int largestRectangleArea(int[] heights) {
        int area = 0, n = heights.length;
        for (int i = 0; i < n; i++) {
            //向左找到比当前高度更低的一行
            int w = 1, h = heights[i], j = i;
            while (--j >= 0 && heights[j] >= h) {
                w++;
            }
            //向右找到比当前高度更低的一行
            j = i;
            while (++j < n && heights[j] >= h) {
                w++;
            }
            area = Math.max(area, w * h);
        }

        return area;
    }

    public int largestRectangleArea2(int[] heights) {
        int len = heights.length;
        // 特判
        if (len == 0) {
            return 0;
        }

        int res = 0;
        for (int i = 0; i < len; i++) {

            // 找左边最后 1 个大于等于 heights[i] 的下标
            int left = i;
            int curHeight = heights[i];
            while (left > 0 && heights[left - 1] >= curHeight) {
                left--;
            }

            // 找右边最后 1 个大于等于 heights[i] 的索引
            int right = i;
            while (right < len - 1 && heights[right + 1] >= curHeight) {
                right++;
            }
            int width = right - left + 1;
            res = Math.max(res, width * curHeight);
        }
        return res;
    }
}
