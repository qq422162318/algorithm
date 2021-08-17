package 算法题;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * 855. 考场就座
 * 在考场里，一排有 N 个座位，分别编号为 0, 1, 2, ..., N-1 。
 * 当学生进入考场后，他必须坐在能够使他与离他最近的人之间的距离达到最大化的座位上。如果有多个这样的座位，他会坐在编号最小的座位上。(另外，如果考场里没有人，那么学生就坐在 0 号座位上。)
 * 返回 ExamRoom(int N) 类，它有两个公开的函数：其中，函数 ExamRoom.seat() 会返回一个 int （整型数据），代表学生坐的位置；函数 ExamRoom.leave(int p) 代表坐在座位 p 上的学生现在离开了考场。每次调用 ExamRoom.leave(p) 时都保证有学生坐在座位 p 上。
 * 示例：
 * 输入：["ExamRoom","seat","seat","seat","seat","leave","seat"], [[10],[],[],[],[],[4],[]]
 * 输出：[null,0,9,4,2,null,5]
 * 解释：
 * ExamRoom(10) -> null
 * seat() -> 0，没有人在考场里，那么学生坐在 0 号座位上。
 * seat() -> 9，学生最后坐在 9 号座位上。
 * seat() -> 4，学生最后坐在 4 号座位上。
 * seat() -> 2，学生最后坐在 2 号座位上。
 * leave(4) -> null
 * seat() -> 5，学生最后坐在 5 号座位上。
 */
public class likou855 {
    public static void main(String[] args) {
        likou855 likou = new likou855();
        ExamRoom examRoom = likou.new ExamRoom(10);
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat());
        examRoom.leave(0);
        examRoom.leave(4);
    }

    class ExamRoom {
        private Map<Integer, int[]> startMap;
        private Map<Integer, int[]> endMap;
        private TreeSet<int[]> pq;
        private int N;

        public ExamRoom(int n) {
            this.N = n;
            startMap = new HashMap<>();
            endMap = new HashMap<>();
            pq = new TreeSet<>((a, b) -> {
                int distA = distance(a);
                int distB = distance(b);
                if (distA == distB)
                    return b[0] - a[0];
                return distA - distB;
            });
            addInterval(new int[]{-1, n});
        }

        private void addInterval(int[] ints) {
            pq.add(ints);
            startMap.put(ints[0], ints);
            endMap.put(ints[1], ints);
        }

        private void removeInterval(int[] intv) {
            pq.remove(intv);
            startMap.remove(intv[0]);
            endMap.remove(intv[1]);
        }

        private int distance(int[] a) {
            int x = a[0];
            int y = a[1];
            if (x == -1) return y;
            if (y == N) return N - 1 - x;
            return (y - x) / 2;
        }

        public int seat() {
            int[] longest = pq.last();
            int x = longest[0];
            int y = longest[1];
            int seat;
            if (x == -1) {
                seat = 0;
            } else if (y == N) {
                seat = N - 1;
            } else {
                seat = (y - x) / 2 + x;
            }
            int[] left = new int[]{x, seat};
            int[] right = new int[]{seat, y};
            removeInterval(longest);
            addInterval(left);
            addInterval(right);
            return seat;
        }

        public void leave(int p) {
            int[] right = startMap.get(p);
            int[] left = endMap.get(p);
            int[] merge = new int[]{left[0], right[1]};
            removeInterval(left);
            removeInterval(right);
            addInterval(merge);
        }
    }
    /**
     * Your ExamRoom object will be instantiated and called as such:
     * ExamRoom obj = new ExamRoom(n);
     * int param_1 = obj.seat();
     * obj.leave(p);
     */
}
