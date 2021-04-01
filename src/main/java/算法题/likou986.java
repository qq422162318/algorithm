package 算法题;

import com.sun.media.sound.SF2InstrumentRegion;

import java.util.Arrays;

/**
 * 986. 区间列表的交集
 * 给定两个由一些 闭区间 组成的列表，firstList 和 secondList ，其中 firstList[i] = [starti, endi] 而 secondList[j] = [startj, endj] 。每个区间列表都是成对 不相交 的，并且 已经排序 。
 * 返回这 两个区间列表的交集 。
 * 形式上，闭区间 [a, b]（其中 a <= b）表示实数 x 的集合，而 a <= x <= b 。
 * 两个闭区间的 交集 是一组实数，要么为空集，要么为闭区间。例如，[1, 3] 和 [2, 4] 的交集为 [2, 3] 。
 * 示例 1：
 * 输入：firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
 * 输出：[[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
 * 示例 2：
 * 输入：firstList = [[1,3],[5,9]], secondList = []
 * 输出：[]
 * 示例 3：
 * 输入：firstList = [], secondList = [[4,8],[10,12]]
 * 输出：[]
 * 示例 4：
 * 输入：firstList = [[1,7]], secondList = [[3,10]]
 * 输出：[[3,7]]
 */
public class likou986 {
    public static void main(String[] args) {
        likou986 likou = new likou986();
        int[][] fist=new int[][]{{0,2},{5,10},{13,23},{24,25}};
        int[][] second=new int[][]{{1,5},{8,12},{15,24},{25,26}};
        int[][] ints = likou.intervalIntersection(fist, second);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i+"\t");
            }
        }
    }
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i=0,j=0;
        int length = firstList.length;
        int length1 = secondList.length;
        int index=0;
        int[][] res=new int[length+length1][2];
        while(i<firstList.length&&j<secondList.length){
            int a1=firstList[i][0];
            int a2=firstList[i][1];
            int b1=secondList[j][0];
            int b2=secondList[j][1];
            if (b2>=a1&&a2>=b1){
                res[index][0]=Math.max(a1,b1);
                res[index++][1]=Math.min(a2,b2);
            }
            if (b2<a2){
                j++;
            }else {
                i++;
            }
        }
        return Arrays.copyOf(res,index);
    }
}
