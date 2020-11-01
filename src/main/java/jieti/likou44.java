package jieti;
/**
 * 44. 通配符匹配
 * 给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。
 * '?' 可以匹配任何单个字符。
 * '*' 可以匹配任意字符串（包括空字符串）。
 * 两个字符串完全匹配才算匹配成功。
 * 说明:
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 ? 和 *。
 * 示例 1:
 * 输入:
 * s = "aa"
 * p = "a"
 * 输出: false
 * 解释: "a" 无法匹配 "aa" 整个字符串。
 * 示例 2:
 * 输入:
 * s = "aa"
 * p = "*"
 * 输出: true
 * 解释: '*' 可以匹配任意字符串。
 * 示例 3:
 * 输入:
 * s = "cb"
 * p = "?a"
 * 输出: false
 * 解释: '?' 可以匹配 'c', 但第二个 'a' 无法匹配 'b'。
 * 示例 4:
 * 输入:
 * s = "adceb"
 * p = "*a*b"
 * 输出: true
 * 解释: 第一个 '*' 可以匹配空字符串, 第二个 '*' 可以匹配字符串 "dce".
 * 示例 5:
 * 输入:
 * s = "acdcb"
 * p = "a*c?b"
 * 输出: false
 */
public class likou44 {
    public static void main(String[] args) {
        String s="aa",p="*";
        boolean ismatch = ismatch(s, p);
        System.out.println(ismatch);
    }
    public static boolean ismatch(String s,String p){
        int slen=s.length(),plen=p.length();
        int i=0,j=0,start=-1,match=0;
        while(i<slen){
             // 一对一匹配,匹配成功一起移
            if (j<plen&&(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?')){
                i++;
                j++;
            }
            //# 记录p的"*"的位置,还有s的位置
            else if (j<plen&&p.charAt(j)=='*'){
                start=j;
                match=i;
                j++;
            }
            // # j 回到 记录的下一个位置
            // # match 更新下一个位置
            // # 这不代表用*匹配一个字符
            else if (start!=-1){
                j=start+1;
                match++;
                i=match;
            }
            else{
                return false;
            }
        }
      while(j<plen){
          if (p.charAt(j)!='*'){
              return false;
          }
          j++;
      }
        return true;
    }
}
