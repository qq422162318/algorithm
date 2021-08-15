package 算法题;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 391. 完美矩形
 * 我们有 N 个与坐标轴对齐的矩形, 其中 N > 0, 判断它们是否能精确地覆盖一个矩形区域。
 * 每个矩形用左下角的点和右上角的点的坐标来表示。例如， 一个单位正方形可以表示为 [1,1,2,2]。
 * ( 左下角的点的坐标为 (1, 1) 以及右上角的点的坐标为 (2, 2) )。
 * 示例 1:
 * rectangles = [
 * [1,1,3,3],
 * [3,1,4,2],
 * [3,2,4,4],
 * [1,3,2,4],
 * [2,3,3,4]
 * ]
 * 返回 true。5个矩形一起可以精确地覆盖一个矩形区域。
 * 示例 2:
 * rectangles = [
 * [1,1,2,3],
 * [1,3,2,4],
 * [3,1,4,2],
 * [3,2,4,4]
 * ]
 * 返回 false。两个矩形之间有间隔，无法覆盖成一个矩形。
 * 示例 3:
 * rectangles = [
 * [1,1,3,3],
 * [3,1,4,2],
 * [1,3,2,4],
 * [3,2,4,4]
 * ]
 * 返回 false。图形顶端留有间隔，无法覆盖成一个矩形。
 * 示例 4:
 * rectangles = [
 * [1,1,3,3],
 * [3,1,4,2],
 * [1,3,2,4],
 * [2,2,4,4]
 * ]
 * 返回 false。因为中间有相交区域，虽然形成了矩形，但不是精确覆盖。
 */
public class likou391 {
    public static void main(String[] args) {
        int[][] s = {
                {1, 1, 3, 3},
                {3, 1, 4, 2},
                {3, 2, 4, 4},
                {1, 3, 2, 4},
                {2, 3, 3, 4}
        };
        likou391 likou = new likou391();
        System.out.println(likou.isRectangleCover(s));
    }

    public boolean isRectangleCover(int[][] rectangles) {
        int x1 = 1, x2 = 1;
        int y1 = 1, y2 = 1;
        Set<String> set = new HashSet<>();
        int actual_area = 0;
        ArrayList<String> temp = new ArrayList<>();
        for (int[] rect : rectangles) {
            x1 = Math.min(x1, rect[0]);
            y1 = Math.min(y1, rect[1]);
            x2 = Math.max(x2, rect[2]);
            y2 = Math.max(y2, rect[3]);
            actual_area += (rect[2] - rect[0]) * (rect[3] - rect[1]);
            add(temp,rect);
            for (String in : temp) {
                if (set.contains(in))
                    set.remove(in);
                else
                    set.add(in);
            }
            for (int i = temp.size()-1; i >= 0; i--) temp.remove(i);
        }
        int expect_area = (x2 - x1) * (y2 - y1);
        if (expect_area != actual_area) return false;
        if (set.size() != 4) return false;
        add(temp,new int[]{x1,y1,x2,y2});
        for (String in : temp)
            if (!set.contains(in)) return false;
        return true;
    }

    private void add(ArrayList<String> temp, int[] rect) {
        String p1 = str(rect[0], rect[1]);
        String p2 = str(rect[0], rect[3]);
        String p3 = str(rect[2], rect[1]);
        String p4 = str(rect[2], rect[3]);
        temp.add(p1);
        temp.add(p2);
        temp.add(p3);
        temp.add(p4);
    }

    private String str(int i, int j) {
        return i + " " + j;
    }
}
