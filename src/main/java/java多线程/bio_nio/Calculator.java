package java多线程.bio_nio;

public class Calculator {
    public static String cal(String expression) {
        String[] split = expression.split(",");
        int result;
        switch (split[1]) {
            case "+":
                result = getInt(split[0]) + getInt(split[2]);
                break;
            case "-":
                result = getInt(split[0]) - getInt(split[2]);
                break;
            case "*":
                result = getInt(split[0]) * getInt(split[2]);
                break;
            case "/":
                result = getInt(split[0]) / getInt(split[2]);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + split[1]);
        }
        return String.valueOf(result);
    }

    public static int getInt(String s) {
        return (int) Integer.valueOf(s);
    }
}
