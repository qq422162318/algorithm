package 算法题;

import javafx.beans.property.ReadOnlyBooleanWrapper;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class likou752 {
    public static void main(String[] args) {
        likou752 likou752 = new likou752();
        //        likou752.bfs("1234");
        String[] strings=new String[]{"0201","0101","0102","1212","2002"};
        String target="0202";
        System.out.println(likou752.openLock2(strings, target));
    }
    //正确解法(单向bfs)
    public int openLock(String[] deadends, String target) {
        HashSet<String> deads = new HashSet<>();
        for (String deadend : deadends) deads.add(deadend);
        HashSet<String> visited = new HashSet<>();
        Queue<String> queue=new LinkedList<>();
        int step=0;
        queue.offer("0000");
        visited.add("0000");
        while (!queue.isEmpty()){
            int size=queue.size();
            /* 将当前队列中的所有节点向周围扩散 */
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                /* 判断是否到达终点 */
                if (deads.contains(cur)){
                    continue;
                }
                if (cur.equals(target))return step;
                /* 将一个节点的未遍历相邻节点加入队列 */
                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    if (!visited.contains(up)){
                        queue.offer(up);
                        visited.add(up);
                    }
                    String down = minusOne(cur, j);
                    if (!visited.contains(down)){
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
        Set<String> deads=new HashSet<>();
        for (String deadend : deadends)
            deads.add(deadend);
        Set<String> q1=new HashSet<>();
        Set<String> q2=new HashSet<>();
        Set<String> visited=new HashSet<>();
        int step=0;
        q1.add("0000");
        q2.add(target);
        while (!q1.isEmpty()&&!q2.isEmpty()){
            Set<String> temp=new HashSet<>();
            if (q1.size()>q2.size()){
                temp=q1;
                q1=q2;
                q2=temp;
            }
            for (String cur : q1) {
                /* 判断是否到达终点 */
                if (deads.contains(cur))
                    continue;
                if (q2.contains(cur))
                    return step;
                visited.add(cur);
                for (int j = 0; j < 4; j++) {
                    String up=plusOne(cur,j);
                    if (!visited.contains(up))
                        temp.add(up);
                    String down=minusOne(cur,j);
                    if (!visited.contains(down))
                        temp.add(down);
                }
            }
            step++;
            // temp 相当于 q1
            // 这里交换 q1 q2，下一轮 while 就是扩散 q2
            q1=q2;
            q2=temp;
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
