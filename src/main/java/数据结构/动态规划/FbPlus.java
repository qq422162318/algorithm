package 数据结构.动态规划;
//解决斐波拉契重复计算问题(自底向上)
public class FbPlus {
    public static int fb(int n){
        //数据合法性校验
        if (n<=0){ return -1; }
        //备忘录
        int[] memory=new int[n+1];
        memory[1]=1;
        memory[2]=1;
        for (int i=3;i<=n;i++){ memory[i]=memory[i-1]+memory[i-2]; }
        return memory[n];
    }

    public static void main(String[] args) {
        int fb = fb(5);
        System.out.println(fb);
    }
}
