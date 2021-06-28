package 算法题;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 752. 打开转盘锁
 * 你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' 。每个拨轮可以自由旋转：例如把 '9' 变为 '0'，'0' 变为 '9' 。每次旋转都只能旋转一个拨轮的一位数字。
 * 锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。
 * 列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。
 * 字符串 target 代表可以解锁的数字，你需要给出解锁需要的最小旋转次数，如果无论如何不能解锁，返回 -1 。
 * 示例 1:
 * 输入：deadends = ["0201","0101","0102","1212","2002"], target = "0202"
 * 输出：6
 * 解释：
 * 可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202"。
 * 注意 "0000" -> "0001" -> "0002" -> "0102" -> "0202" 这样的序列是不能解锁的，
 * 因为当拨动到 "0102" 时这个锁就会被锁定。
 * 示例 2:
 * 输入: deadends = ["8888"], target = "0009"
 * 输出：1
 * 解释：
 * 把最后一位反向旋转一次即可 "0000" -> "0009"。
 * 示例 3:
 * 输入: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
 * 输出：-1
 * 解释：
 * 无法旋转到目标数字且不被锁定。
 * 示例 4:
 * 输入: deadends = ["0000"], target = "8888"
 * 输出：-1
 */
public class likou752 {
    public static void main(String[] args) {
        likou752 likou752 = new likou752();
        //        likou752.bfs("1234");
        String[] strings = new String[]{"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        System.out.println(likou752.openLock(strings, target));
    }

    //正确解法(单向bfs)
    public int openLock(String[] deadends, String target) {
        HashSet<String> deads = new HashSet<>();
        for (String deadend : deadends) deads.add(deadend);
        HashSet<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        int step = 0;
        queue.offer("0000");
        visited.add("0000");
        while (!queue.isEmpty()) {
            int size = queue.size();
            /* 将当前队列中的所有节点向周围扩散 */
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                /* 判断是否到达终点 */
                if (deads.contains(cur)) {
                    continue;
                }
                if (cur.equals(target)) return step;
                /* 将一个节点的未遍历相邻节点加入队列 */
                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    if (!visited.contains(up)) {
                        queue.offer(up);
                        visited.add(up);
                    }
                    String down = minusOne(cur, j);
                    if (!visited.contains(down)) {
                        queue.offer(down);
                        visited.add(down);
                    }
                }
            }
            /* 在这里增加步数 */
            step++;
        }
        // 如果穷举完都没找到目标密码，那就是找不到了
        return -1;
    }

    //解法(双向bfs)
    public int openLock2(String[] deadends, String target) {
        Set<String> deads = new HashSet<>();
        for (String deadend : deadends)
            deads.add(deadend);
        Set<String> q1 = new HashSet<>();
        Set<String> q2 = new HashSet<>();
        Set<String> visited = new HashSet<>();
        int step = 0;
        q1.add("0000");
        q2.add(target);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            Set<String> temp = new HashSet<>();
            if (q1.size() > q2.size()) {
                temp = q1;
                q1 = q2;
                q2 = temp;
            }
            for (String cur : q1) {
                /* 判断是否到达终点 */
                if (deads.contains(cur))
                    continue;
                if (q2.contains(cur))
                    return step;
                visited.add(cur);
                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    if (!visited.contains(up))
                        temp.add(up);
                    String down = minusOne(cur, j);
                    if (!visited.contains(down))
                        temp.add(down);
                }
            }
            step++;
            // temp 相当于 q1
            // 这里交换 q1 q2，下一轮 while 就是扩散 q2
            q1 = q2;
            q2 = temp;
        }
        return -1;
    }

    //遍历所有可能性
    public void bfs(String target) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                System.out.println(cur);
                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    String down = minusOne(cur, j);
                    queue.offer(up);
                    queue.offer(down);
                }
            }
        }
    }

    private String minusOne(String cur, int j) {
        char[] chars = cur.toCharArray();
        if (chars[j] == '0') chars[j] = '9';
        else chars[j] += 1;
        return new String(chars);
    }

    private String plusOne(String cur, int j) {
        char[] chars = cur.toCharArray();
        if (chars[j] == '9') chars[j] = '0';
        else chars[j] += 1;
        return new String(chars);
    }

}
