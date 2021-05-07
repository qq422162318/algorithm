package 算法题;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxPQ<key extends Comparable<key>> {
    private key[] pq;
    /**
     * 元素个数
     */
    private int N = 0;

    public MaxPQ(int cap) {
        pq = (key[]) new Comparable[cap + 1];
    }

    public key max() {
        return pq[1];
    }

    public void insert(key e) {
      N++;
      pq[N]=e;
      swim(N);
    }

    public key delMax(int k) {
        key max = pq[1];
        exchange(1,N);
        pq[N]=null;
        N--;
        sink(1);
        return max;
    }

    /**
     * @param k 下沉元素（key）
     */
    private void sink(int k) {
       //如果沉到堆底，就不用继续了
        while(left(k)<=N){
            int older=left(k);
            if (right(k)<=N&&less(older,right(k))){
                older=right(k);
            }
            if (less(older,k))break;
            exchange(k,older);
            k=older;
        }

    }

    private int left(int k) {
       return k<<1;
    }
    private int right(int k) {
        return k<<1+1;
    }
    /**
     * @param k 要上浮的元素
     */
    private void swim(int k) {
        //如果浮到堆顶就不用上浮了
        while (k > 1 && less(parent(k), k)) {
            exchange(parent(k), k);
            k = parent(k);
        }
    }

    private int parent(int k) {
        if (k <= 1) return 1;
        return k>>>2;
    }

    private void exchange(int i, int j) {
        key temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

}
