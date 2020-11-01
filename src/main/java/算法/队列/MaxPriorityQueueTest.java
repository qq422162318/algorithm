package 算法.队列;

public class MaxPriorityQueueTest {
    public static void main(String[] args) {
        //创建优先队列
        MinPriorityQueue<String> queue = new MinPriorityQueue<>(10);
        queue.insert("A");
        queue.insert("B");
        queue.insert("C");
        queue.insert("D");
        queue.insert("E");
        queue.insert("F");
        queue.insert("G");
        while (!queue.isEmpty()){
            String max=queue.delMin();
            System.out.print(max+"  ");
        }
    }
}
