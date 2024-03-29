package 算法题;

import org.omg.PortableServer.ForwardRequest;
import sun.print.SunMinMaxPage;

/**
 * 43. 字符串相乘
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * <p>
 * 示例 1:
 * <p>
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * 示例 2:
 * <p>
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 * 说明：
 * <p>
 * num1 和 num2 的长度小于110。
 * num1 和 num2 只包含数字 0-9。
 * num1 和 num2 均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 */
public class likou43 {
    public static void main(String[] args) {
        likou43 multiplyString = new likou43();
        String s1 = "123456789";
//        String s1 = "123";
        String s2 = "987654321";
//        String s2 = "456";
        //String multiply = multiplyString.multiply(s1, s2);
        String s = multiplyString.multiply3(s1, s2);
        System.out.println(s);
    }

    public String multiply(String num1, String num2) {
        long i = Integer.parseInt(num1);
        long i1 = Integer.parseInt(num2);
        return String.valueOf(i * i1);
    }

    public String multiply2(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int m = num1.length(), n = num2.length();
        int[] answer = new int[m + n];
        for (int i = m - 1; i >= 0; --i) {
            int x = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; --j) {
                int y = num2.charAt(j) - '0';
                answer[i + j + 1] += x * y;   // 记录
            }
        }
        // 集中处理进位
        for (int i = m + n - 1; i > 0; --i) {
            answer[i - 1] += answer[i] / 10;
            answer[i] %= 10;
        }
        // 判断是否结果的长度是不是m+n，否则是m+n-1
        int index = answer[0] == 0 ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        while (index < m + n) {
            sb.append(answer[index]);
            ++index;
        }
        return sb.toString();
    }

    public String multiply3(String num1, String num2) {
        if (num1.equals('0') || num2.equals('0')) return "0";
        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + res[p2];
                res[p1] += sum / 10;
                res[p2] = sum % 10;
            }
        }
        int i = 0;
        while (i < m + n && res[i] == 0) i++;
        StringBuilder sb = new StringBuilder();
        for (; i < res.length; i++) {
            sb.append(res[i]);
        }
        return sb.toString();
    }
}