package 算法.排序;

public class Quick {
    //快速排序
    private static Comparable[] assist;
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    private static void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void sort(Comparable[] a){
    int left=0;
    int right=a.length-1;
    sort(a,left,right);
    }
    public static void sort(Comparable[] a,int left,int right){
    if (right<=left){
        return;
    }
    //需要对数组中lo索引处的元素进行分组(左子组和右子组)
    int partition=partition(a,left,right);//返回的是分组的分界值所在的索引,分界值位置变换后的索引
    //让左子组有序
        sort(a,left,partition-1);
        //让右子组有序
        sort(a,partition+1,right);
    }
    //对数组a中,从索引left到索引right之间的元素进行分组,并返回分组界限对应的索引
    public static int partition(Comparable[] a,int lo,int hi){
       //确定分界值
        Comparable key=a[lo];
        int left=lo;
        int right=hi+1;
        while(true) {
            while (less(key, a[--right])) {
                //先从右往左扫描移动right指针,找一个比分界值小的元素,停止
                if (right == lo) {
                    break;
                }
            }
            //先从左往右
            while (less(a[++left], key)) {
                if (left == hi) {
                    break;
                }
            }
            if (left >= right) {
                break;
            } else {
            exch(a,left,right);
            }
        }
        exch(a,lo,right);
        return right;
    }

}

