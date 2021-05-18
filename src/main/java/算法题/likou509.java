package 算法题;

public class likou509 {
    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        int a = 1;
        int b = 0;
        for (int i = 1; i < n; i++) {
            a = a + b;
            b = a - b;
        }
        return a;
    }

    public int fib2(int n) {
        if (n == 0 || n == 1) return n;
        int[] memo = new int[n + 1];
        return help(memo, n);
    }

    private int help(int[] memo, int n) {
        if (n <= 1) return 1;
        if (memo[n] != 0) return memo[n];
        memo[n] = help(memo, n - 1) + help(memo, n - 2);
        return memo[n];
    }

    public int fib3(int n) {
      if (n==0)return n;
      int[] dp=new int[n+1];
      dp[1]=1;dp[2]=1;
        for (int i = 3; i < n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
