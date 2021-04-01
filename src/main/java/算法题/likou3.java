package 算法题;

import java.util.HashMap;

public class likou3 {
    public static void main(String[] args) {
       String s = "abcabcbb";
        likou3 likou3 = new likou3();
        System.out.println(likou3.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> window = new HashMap<>();
        int res=0,left=0,right=0;
        while(right<s.length()){
            char c = s.charAt(right);
            right++;
            window.put(c,window.getOrDefault(c,0)+1);
            while (window.get(c)>1){
                char c1 = s.charAt(left);
                left++;
                window.put(c1,window.get(c1)-1);
            }
            res=Math.max(res,right-left);
        }
        return res;
    }
}
