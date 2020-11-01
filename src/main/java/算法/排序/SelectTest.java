package 算法.排序;

import java.util.Arrays;

public class SelectTest {
    public static void main(String[] args) {
        Integer[] a={4,6,8,7,9,2,10,1};
        Selection.sort(a);

        String s = Arrays.toString(a);
        System.out.println(s);
    }
}
