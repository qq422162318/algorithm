package 算法题.剑指offer;
/**
 * 剑指 Offer 09. 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * 示例 1：
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * 示例 2：
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 * 提示：
 * 1 <= values <= 10000
 * 最多会对 appendTail、deleteHead 进行 10000 次调用
 */
import java.util.LinkedList;
public class problem9 {
    class CQueue {
        LinkedList<Integer> in;
        LinkedList<Integer> out;
        int size;
        public CQueue() {
            in=new LinkedList<>();
            out=new LinkedList<>();
        }

        public void appendTail(int value) {
            in.addLast(value);
        }

        public int deleteHead() {
            if (!out.isEmpty())
                return out.removeLast();
            if (in.isEmpty()){
                return -1;
            }
            while (!in.isEmpty()){
                out.add(in.removeLast());
            }
            return out.removeLast();
        }
    }
}
