package 数据结构.排序;

import java.util.Arrays;

public class Merge {
    //归并排序
    private Comparable[] assist;

    private boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public void sort(Comparable[] a) {
        assist = new Comparable[a.length];
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);
    }

    public void sort(Comparable[] a, int left, int right) {
        //安全校验
        if (right <= left) {
            return;
        }
        //对lo到hi的数据进行分组
        int mid = left + (right - left) / 2;
        //对每一组数据排序
        sort(a, left, mid);
        sort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    public void merge(Comparable[] a, int left, int mid, int right) {
        //定义三指针
        int i = left;
        int p1 = left;
        int p2 = mid + 1;
        //遍历,移动p1指针和p2指针,比较对应索引处的值,找出小的那个,放到辅助数组的对应索引处
        while (p1 <= mid && p2 <= right) {
            //比较对应索引处的值
            if (less(a[p1], a[p2])) {
                assist[i++] = a[p1++];
            } else {
                assist[i++] = a[p2++];
            }
        }
        //如果p2>hi则把p1剩余元素放到对应索引处
        while (p1 <= mid) {
            assist[i++] = a[p1++];
        }
        //如果p1>mid则把p2剩余元素放到对应索引处
        while (p2 <= right) {
            assist[i++] = a[p2++];
        }
        //将辅助数组中的元素拷贝到原数组中
        for (int index = 0; index <= right; index++) {
            a[index] = assist[index];
        }
    }
}
