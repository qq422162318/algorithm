package 算法题;

import java.util.HashMap;
import java.util.Random;

/**
 * 710. 黑名单中的随机数
 * 给定一个包含 [0，n ) 中独特的整数的黑名单 B，写一个函数从 [ 0，n ) 中返回一个不在 B 中的随机整数。
 * 对它进行优化使其尽量少调用系统方法 Math.random() 。
 * 提示:
 * 1 <= N <= 1000000000
 * 0 <= B.length < min(100000, N)
 * [0, N) 不包含 N，详细参见 interval notation 。
 * 示例 1:
 * <p>
 * 输入:
 * ["Solution","pick","pick","pick"]
 * [[1,[]],[],[],[]]
 * 输出: [null,0,0,0]
 * 示例 2:
 * <p>
 * 输入:
 * ["Solution","pick","pick","pick"]
 * [[2,[]],[],[],[]]
 * 输出: [null,1,1,1]
 * 示例 3:
 * <p>
 * 输入:
 * ["Solution","pick","pick","pick"]
 * [[3,[1]],[],[],[]]
 * Output: [null,0,0,2]
 * 示例 4:
 * <p>
 * 输入:
 * ["Solution","pick","pick","pick"]
 * [[4,[2]],[],[],[]]
 * 输出: [null,1,3,1]
 * 输入语法说明：
 * <p>
 * 输入是两个列表：调用成员函数名和调用的参数。Solution的构造函数有两个参数，N 和黑名单 B。pick 没有参数，输入参数是一个列表，即使参数为空，也会输入一个 [] 空列表。
 */
public class likou710 {
    class Solution {

        int sz = 0;
        HashMap<Integer, Integer> map;

        public Solution(int N, int[] blacklist) {
            map=new HashMap<Integer,Integer>();
            sz = N - blacklist.length;
            for (int i : blacklist) {
                map.put(i, 666);
            }
            int last = N - 1;
            for (int i : blacklist) {
                if (i >= sz) {
                    continue;
                }
                while (map.containsKey(last)) {
                    last--;
                }
                map.put(i, last);
                last--;
            }
        }

        public int pick() {
            int i = new Random().nextInt();
            int index = i % sz;
            if (map.containsKey(index)) {
                return map.get(index);
            }
            return index;
        }
    }
}
