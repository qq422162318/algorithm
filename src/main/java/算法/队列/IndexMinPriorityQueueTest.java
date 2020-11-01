package 算法.队列;

public class IndexMinPriorityQueueTest {
    public static void main(String[] args) {
        IndexMinPriorityQueue<String> queue=new IndexMinPriorityQueue<>(10);
        queue.insert(0, "A");
        queue.insert(1,"C");
        queue.insert(2, "F");
        queue.changeItem(2, "B");
        while(!queue.isEmpty()){
            int index=queue.delMin();
            System.out.print(index+"");
        }
    }
}