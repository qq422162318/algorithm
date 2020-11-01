package jieti;

import jdk.nashorn.internal.ir.CallNode;

/**
 * 50. Pow(x, n)
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 *
 * 示例 1:
 *
 * 输入: 2.00000, 10
 * 输出: 1024.00000
 * 示例 2:
 *
 * 输入: 2.10000, 3
 * 输出: 9.26100
 * 示例 3:
 *
 * 输入: 2.00000, -2
 * 输出: 0.25000
 * 解释: 2-2 = 1/22 = 1/4 = 0.25
 * 说明:
 *
 * -100.0 < x < 100.0
 * n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
 */
public class likou50 {
    public static void main(String[] args) {
        double num=2;
        double temp=num;
        for (int i = 1; i <5 ; i++) {
            num*=temp;
        }
        System.out.println(num);
        double v = myPow(num, -2);
        System.out.println(v);
    }
    public static double myPow(double x,int n){
        long N=n;
        //调用大于0直接调用小于0那1.0处以x的n次方
        return N>=0?quickMul(x,N):1.0/quickMul(x,-N);
    }
    public static double quickMul(double s,long N){
        if (N==0){
            return 1.0;
        }
        double y=quickMul(s,N/2);
        return N%2==0?y*y:y*y*s;
    }

}
