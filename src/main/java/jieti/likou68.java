package jieti;
import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.ArrayList;
import java.util.List;
/**
 * 68. 文本左右对齐
 * 给定一个单词数组和一个长度 maxWidth，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。
 * 你应该使用“贪心算法”来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有 maxWidth 个字符。
 * 要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。
 * 文本的最后一行应为左对齐，且单词之间不插入额外的空格。
 * 说明:
 * 单词是指由非空格字符组成的字符序列。
 * 每个单词的长度大于 0，小于等于 maxWidth。
 * 输入单词数组 words 至少包含一个单词。
 * 示例:
 * 输入:
 * words = ["This", "is", "an", "example", "of", "text", "justification."]
 * maxWidth = 16
 * 输出:
 * [
 *    "This    is    an",
 *    "example  of text",
 *    "justification.  "
 * ]
 * 示例 2:
 * 输入:
 * words = ["What","must","be","acknowledgment","shall","be"]
 * maxWidth = 16
 * 输出:
 * [
 *   "What   must   be",
 *   "acknowledgment  ",
 *   "shall be        "
 * ]
 * 解释: 注意最后一行的格式应为 "shall be    " 而不是 "shall     be",
 *      因为最后一行应为左对齐，而不是左右两端对齐。
 *      第二行同样为左对齐，这是因为这行只包含一个单词。
 * 示例 3:
 * 输入:
 * words = ["Science","is","what","we","understand","well","enough","to","explain",
 *          "to","a","computer.","Art","is","everything","else","we","do"]
 * maxWidth = 20
 * 输出:
 * [
 *   "Science  is  what we",
 *   "understand      well",
 *   "enough to explain to",
 *   "a  computer.  Art is",
 *   "everything  else  we",
 *   "do                  "
 * ]
 */
public class likou68 {
    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        likou68 likou68 = new likou68();
        List<String> strings = likou68.fullJustify(words, maxWidth);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;
        int n = words.length;
        while (i < n) {
            // 找到一行可以容下单词
            int left = i;
            // 至少一行能放下一个单词
            int current_row_len = words[i].length();
            i++;
            while (i < n) {
                if (current_row_len + words[i].length() + 1 > maxWidth)
                    break;
                current_row_len += words[i].length() + 1;
                i++;
            }
            //System.out.println(left);
            //System.out.println(i);
            StringBuilder tmp = new StringBuilder();
            // 考虑最后一行
            if (i == n) {
                for (int j = left; j < i; j++) {
                    tmp.append(words[j] + " ");
                }
                tmp.deleteCharAt(tmp.length() - 1);
                for (int j = tmp.length(); j < maxWidth; j++) {
                    tmp.append(" ");
                }
                res.add(tmp.toString());
                break;
            }
            int all_word_len = 0;
            // 所有单词长度
            for (int j = left; j < i; j++) {
                all_word_len += words[j].length();
            }
            //System.out.println(all_word_len);
            // 至少空格个数
            int space_num = i - left - 1;
            // 可以为空格的位置个数
            int remain_space = maxWidth - all_word_len;
            int a = 0, b = 0;
            if (space_num != 0) {
                a = remain_space / space_num;
                b = remain_space % space_num;
            }
            for (int j = left; j < i; j++) {
                if (tmp.length() > 0) {
                    for (int k = 0; k < a; k++) tmp.append(" ");
                    if (b != 0) {
                        tmp.append(" ");
                        b--;
                    }
                }
                tmp.append(words[j]);
            }
            for (int j = tmp.length(); j < maxWidth; j++) {
                tmp.append(" ");
            }
            res.add(tmp.toString());
        }
        return res;
    }

    public List<String> fullJustify2(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        //当前行单词已经占用的长度
        int currentLen = 0;
        //保存当前行的单词
        List<String> row = new ArrayList<>();
        //遍历每个单词
        for (int i = 0; i < words.length; ) {
            //判断加入该单词是否超过最长长度
            //分了两种情况，一种情况是加入第一个单词，不需要多加 1
            //已经有单词的话，再加入单词，需要多加个空格，所以多加了 1
            if (currentLen == 0 && currentLen + words[i].length() <= maxWidth
                    || currentLen > 0 && currentLen + 1 + words[i].length() <= maxWidth) {
                row.add(words[i]);
                if (currentLen == 0) {
                    currentLen = currentLen + words[i].length();
                } else {
                    currentLen = currentLen + 1 + words[i].length();
                }
                i++;
                //超过的最长长度，对 row 里边的单词进行处理
            } else {
                //计算有多少剩余，也就是总共的空格数，因为之前计算 currentLen 多算了一个空格，这里加回来
                int sub = maxWidth - currentLen + row.size() - 1;
                //如果只有一个单词，那么就直接单词加空格就可以
                if (row.size() == 1) {
                    String blank = getStringBlank(sub);
                    ans.add(row.get(0) + blank);
                } else {
                    //用来保存当前行的结果
                    StringBuilder temp = new StringBuilder();
                    //将第一个单词加进来
                    temp.append(row.get(0));
                    //计算平均空格数
                    int averageBlank = sub / (row.size() - 1);
                    //如果除不尽，计算剩余空格数
                    int missing = sub - averageBlank * (row.size() - 1);
                    //前 missing 的空格数比平均空格数多 1
                    String blank = getStringBlank(averageBlank + 1);
                    int k = 1;
                    for (int j = 0; j < missing; j++) {
                        temp.append(blank + row.get(k));
                        k++;
                    }
                    //剩下的空格数就是求得的平均空格数
                    blank = getStringBlank(averageBlank);
                    for (; k < row.size(); k++) {
                        temp.append(blank + row.get(k));
                    }
                    //将当前结果加入
                    ans.add(temp.toString());

                }
                //清空以及置零
                row = new ArrayList<>();
                currentLen = 0;

            }
        }
        //单独考虑最后一行，左对齐
        StringBuilder temp = new StringBuilder();
        temp.append(row.get(0));
        for (int i = 1; i < row.size(); i++) {
            temp.append(" " + row.get(i));
        }
        //剩余部分用空格补齐
        temp.append(getStringBlank(maxWidth - currentLen));
        //最后一行加入到结果中
        ans.add(temp.toString());
        return ans;
    }

    //得到 n 个空白
    private String getStringBlank(int n) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(" ");
        }
        return str.toString();
    }
}