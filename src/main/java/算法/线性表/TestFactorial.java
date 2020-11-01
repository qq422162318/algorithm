package 算法.线性表;

public class TestFactorial {
    public static void main(String[] args) {
        long result=factorial(5);
        System.out.println(result);
    }

    private static long factorial(int i) {
        if (i==1){
            return 1;
        }
        return i*factorial(i-1);
        }
    }

