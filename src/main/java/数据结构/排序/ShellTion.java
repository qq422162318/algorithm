package 数据结构.排序;

import java.util.Arrays;

public class ShellTion {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        Integer[] a={9,1,2,5,7,4,8,6,3,5};
        Shell.sort(a);

        System.out.println(Arrays.toString(a));
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l+"毫秒");
    }
}
