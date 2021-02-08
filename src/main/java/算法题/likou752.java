package 算法题;

import javafx.beans.property.ReadOnlyBooleanWrapper;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class likou752 {
    public static void main(String[] args) {
        likou752 likou752 = new likou752();
        //        likou752.bfs("1234");
        String[] strings=new String[]{"0201","0101","0102","1212","2002"};
        String target="0202";
        System.out.println(likou752.openLock(strings, target));
    }
    //正确解法
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
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                System.out.println(cur);
                if (deads.contains(cur)){
                    continue;
                }
                if (cur.equals(target))return step;
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
            step++;
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
