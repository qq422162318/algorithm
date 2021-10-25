import java.lang.String;

public class dpTest {
    public static void main(String[] args) {
        int fib = fib2(20);
        System.out.println(16>>6);
    }

    public static int fib(int N) {
        if (N < 1) return 0;
        if (N == 1 || N == 2) return 1;
        int[] dp = new int[N + 1];
        for (int i : dp) {
            dp[i] = 0;
        }
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }

    public static int fib2(int N) {
        if (N < 1) return 0;
        if (N == 1 || N == 2) return 1;
        int prev = 1, curr = 1;
        for (int i = 3; i <= N; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }
}
