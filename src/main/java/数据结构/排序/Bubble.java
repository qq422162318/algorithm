package 数据结构.排序;

public class Bubble {
    //冒泡排序
    public static void sort(Comparable[] a){
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j <a.length-1 ; j++) {

              if (greater(a[j],a[j+1])){
                  exch(a,j,j+1);
              }
            }
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
