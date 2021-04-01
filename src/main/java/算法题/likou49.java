package 算法题;

import java.util.*;

/**
 * 49. 字母异位词分组
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * 示例:
 *
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * 说明：
 *
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 */
public class likou49 {
    public static void main(String[] args) {
        String[] str={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagrams(str);
        for (List<String> list : lists) {
            for (String s : list) {
                System.out.print(s+",");
            }
            System.out.println();
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        if (strs.length==0)return new ArrayList<>();
        Map<String,List> ans=new HashMap<String,List>();
        for (String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=String.valueOf(chars);
            if (!ans.containsKey(key))ans.put(key,new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());

    }
}
