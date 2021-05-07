package 算法题.剑指offer;
/**
 * 剑指 Offer 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * 限制：
 * 0 <= s 的长度 <= 10000
 */
public class problem5 {
    public static void main(String[] args) {
        problem5 problem5 = new problem5();
        System.out.println(problem5.replaceSpace("We are"));
    }
    public String replaceSpace(String s) {
        if (s.length()==0)return null;
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            if (aChar==' '){
                stringBuilder.append("%20");
            }else{
                stringBuilder.append(aChar);
            }
        }
        return stringBuilder.toString();
    }
}
