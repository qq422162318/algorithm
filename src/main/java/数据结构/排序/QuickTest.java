package 数据结构.排序;

import java.util.Arrays;

public class QuickTest {
    public static void main(String[] args) {
    Integer[] a={6,1,2,7,9,3,4,5,8};
        Quick quick = new Quick();
        quick.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
