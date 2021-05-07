package 数据结构.队列;

public class MinPriorityQueue<T extends Comparable<T>> {
    //存储堆中的元素
    private T[] items;
    //记录堆中元素个数
    private int N;

    public MinPriorityQueue(int capacity){
        this.items=(T[])new Comparable[capacity];
        this.N=0;
    }
    //获取队列中元素的个数
    public int size(){
        return N;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return N==0;
    }
    //判断堆中索引i处的元素是否小于索引j出的元素
    private boolean less(int i,int j){
        return items[i].compareTo(items[j])<0;
    }
    //交换堆中i索引和j索引处的值
    private void exch(int i,int j){
        T tmp=items[i];
        items[i]=items[j];
        items[j]=tmp;
    }
    //往堆中插入一个元素
    public void insert(T t){
        items[++N]=t;
        swim(N);
    }
    //删除堆中最大的元素,并返回这个最大元素
    public T delMin(){
        T max = items[1];
        exch(1,N);
        N--;
        sink(1);
        return  max;
    }
    //上浮算法
    private void swim(int k){
        while(k>1){
            if (less(k,k/2)){
                exch(k,k/2);
            }
            k=k/2;
        }
    }
    //下沉算法
    private void sink(int k){
        while(2*k<=N){
            int min;
            if (2*k+1<=N){
                if (less(2*k,2*k+1)){
                    min=2*k;
                }else{
                    min=2*k+1;
                }
            }else{
                min=2*k;
            }
            if (less(k,min)){
                break;
            }
            exch(k,min);
            k=min;
        }
    }
}