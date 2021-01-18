package 数据结构.栈;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> q=new Queue<>();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        q.enqueue("d");

        for (String c :q
                ) {
            System.out.println(c);
        }
        System.out.println("---------------------");
        String result=q.dequeue();
        System.out.println("出队列的元素是"+result);
        System.out.println("剩余元素"+q.size());
    }
}
