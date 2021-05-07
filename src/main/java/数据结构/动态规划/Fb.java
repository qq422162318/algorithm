package 数据结构.动态规划;

/**
 * 演示使用动态规划的思想优化斐波那契数列
 */
public class Fb {


    /**
     * /计算斐波那契数列
     * @param n 计算斐波拉契数列中的某个想
     * @param memory 表示就是备忘录
     * @return 返回的最后计算的某一项的结果
     */
    public static int fib(int n,int[] memory){
     //用-1备忘录中没有记录f(n)的值
        //如果备忘录中记录了该值,直接返回
        if (memory[n]!=-1){
         return memory[n];
     }
        if (n<=2){
            memory[n]=1;
        }else{
            memory[n]=fib(n-1,memory)+fib(n-2,memory);
        }
        return Math.abs(memory[n]);
    }
    public static int fibboaci(int n){
        if (n<=0){//数据不合法
            return -1;
        }
        //创建备忘录
        int[] memory=new int[n+1];
        //给备忘录赋值
        for (int i = 0; i <=n ; i++) {
            memory[i]=-1;
        }
        return fib(n,memory);
    }

    public static void main(String[] args) {
        int fibboaci = fibboaci(5666);
        System.out.println(fibboaci);
    }
}
