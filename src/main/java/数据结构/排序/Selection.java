package 数据结构.排序;
//选择排序
public class Selection {
    //选择排序
    public static void sort(Comparable[] a){
        for (int i = 0; i <=a.length-2 ; i++) {
            int minIndex=i;
            for (int j = i+1; j < a.length; j++) {
                if (greater(a[minIndex],a[j])){
                    minIndex=j;
                }
            }
            exch(a,i,minIndex);
        }
    }

    private static boolean greater(Comparable v,Comparable w) {
        return v.compareTo(w)>0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}
