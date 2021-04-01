package 算法题;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * 438. 找到字符串中所有字母异位词
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 * 说明：
 * 字母异位词指字母相同，但排列不同的字符串。
 * 不考虑答案输出的顺序。
 * 示例 1:
 * 输入:
 * s: "cbaebabacd" p: "abc"
 * 输出:
 * [0, 6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
 *  示例 2:
 * 输入:
 * s: "abab" p: "ab"
 * 输出:
 * [0, 1, 2]
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
 */
public class likou438 {
    public static void main(String[] args) {
           likou438 likou=new likou438();
           String s="cbaebabacd",t="abc";
           List<Integer> li=likou.findAnagrams(s, t);
        //    for(Integer i:li){

        //    }
           System.out.print(li);
    }
    public List<Integer> findAnagrams(String s, String t) {
           HashMap<Character,Integer> window=new HashMap<>();
           HashMap<Character,Integer> need=new HashMap<>();
           char[] temp=t.toCharArray();
           for(char c:temp) need.put(c, need.getOrDefault(c,0)+1);
           int left=0,right=0,valid=0;
           List<Integer> res=new ArrayList<>();
           while(right<s.length()){
               char c=s.charAt(right);
               right++;
               if(need.containsKey(c)){
                   window.put(c, window.getOrDefault(c, 0)+1);
                   if(window.get(c)==need.get(c)){
                       valid++;
                   }
               }
               while(right-left>=t.length()){
                   if(valid==need.size()){
                       res.add(left);
                   }
                   char c1=s.charAt(left);
                   left++;
                   if(need.containsKey(c1)){
                     if(window.get(c1)==need.get(c1)){
                         valid--;
                     } 
                     window.put(c1, window.get(c1)-1);
                   }
               }
           }
           return res;
    }
}
