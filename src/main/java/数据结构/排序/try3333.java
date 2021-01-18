package 数据结构.线性表及排序;

public class try3333 {

    public static void main(String[] args) {
        Integer[] arr={4,5,6,3,2,1};
        sort(arr);
        for (Integer integer : arr) {
            System.out.print(integer);
        }

    }

    public static void sort(Comparable[] a){
        for (int i =1; i<a.length; i++) {
            for (int j = i; j >0; j--) {
                if(greater(a[j-1],a[j])){
                    exch(a,j-1,j);
                }else{
                    break;
                }
            }
        }
    }
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}