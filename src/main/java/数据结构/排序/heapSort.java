package 数据结构.排序;

/**
 * 堆排(MaxHeap)
 */
public class heapSort {
    public void buildMaxHeap(int[] a,int heapSize){
        for (int i = heapSize/2; i >= 0; i--) {
            maxHeapify(a,i,heapSize);
        }
    }

    private void maxHeapify(int[] a, int i, int heapSize) {
        int left=i*2+1,right=i*2+2,largest=i;
        if (left<heapSize&&a[left]>a[largest]) largest=left;
        if (right<heapSize&&a[right]>a[largest]) largest=right;
        if (largest != i) {
            swap(a, i, largest);
            maxHeapify(a,largest,heapSize);
        }
    }

    private void swap(int[] a, int i, int largest) {
        int temp=a[i];
        a[i]=a[largest];
        a[largest]=temp;
    }
}
