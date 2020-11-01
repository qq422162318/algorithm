package Jvm;

public class finally2 {
    public static void main(String[] args) {
        int result=test();
        System.out.println(result);
    }

    private static int test() {
        int i=10;
        try {
            return i;
        } finally {
            i=20;
        }
    }
}
