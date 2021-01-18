package 数据结构.堆;

public class Heap<T extends Comparable<T>> {
    //存储队中的元素
    private T[] items;
    //记录堆中的元素个数
    private int N;
    public Heap(int capacity){
        this.items= (T[]) new Comparable[capacity+1];
        this.N=0;
    }
    //判断堆中索引i处的元素是否小于索引i处的元素
    private  boolean less(int i,int j){
        return items[i].compareTo(items[j])<0;
    }
    //交换堆中索引i和j的值
    private void exch( int i,int j){
        T temp=items[i];
        items[i]=items[j];
        items[j]=temp;
    }
    //往堆中插入一个元素
    public void insert(T t){
      items[++N]=t;
      swim(N);
    }
    //使用上浮算法, 使索引k处的元素能在堆中处于一个正确的位置
    private  void swim(int k){
     //通过循环,不断地比较当前节点父节点的值
        while (k>1){
            if (less(k/2,k)){
                exch(k/2,k);
            }
            k=k/2;

        }
    }
    //删除堆中最大的元素,并返回整个最大元素
    public T delMax(){
        T max=items[1];
        //交换索引1和最大索引处的元素,让完全二叉树中最右侧的元素变为临时节点
        exch(1,N);
        //最大索引处的元素删除掉
        items[N]=null;
        N--;
        sink(1);
        return max;
    }
    //使用下沉算法,是索引k出的元素能在堆中处于正确的位置
    private void sink(int k){
    //通过循环对比当前节点和其左子节点2*k及右子节点2k+1处中的较大值的元素大小,小就交换
        while(2*k<=N){
            //获取当前节点的子节点中的较大节点
            int max;//记录较大节点所在的索引
            if (2*k+1<=N){
                if (less(2*k,2*k+1)){
                 max=2*k+1;
                }else{
                    max=2*k;
                }
            }else{
                max=2*k;
            }

            //比较当前节点和较大节点的值
            if (!less(k,max)){
                break;
            }
            //交换k和max索引的值
            exch(k,max);
            //变换k的值
            k=max;
        }
    }
}
