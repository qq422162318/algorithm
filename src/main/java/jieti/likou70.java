package jieti;

public class likou70 {
    public static void main(String[] args) {
        int i = climbStairs(2);
        System.out.println(i);
    }
    public static int climbStairs(int n){
        int p=0,q=0,r=1;
        for (int i = 1; i <=n ; i++) {
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
