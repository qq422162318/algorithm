package 算法题;

import java.util.HashMap;

public class likou567 {
    public static void main(String[] args) {
//         String t="ab",s="eidbaooo";
        String t="ab", s="eidboaoo";
        likou567 likou = new likou567();
        System.out.println(likou.checkInclusion(t, s));
    }
    public boolean checkInclusion(String t, String s) {
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        for(char c:t.toCharArray())need.put(c,need.getOrDefault(c,0)+1);
        int left=0,right=0,valid=0;
        while (right<s.length()){
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)){
               window.put(c,window.getOrDefault(c,0)+1);
               if (window.get(c)==(need.get(c))) valid++;
            }
            //看一下是1跟2比,2跟3比,3跟4比,4跟5比
            while (right-left>=t.length()){
                if (valid==need.size())return true;
                char left_c = s.charAt(left);
                left++;
                if (need.containsKey(left_c)){
                    if (window.get(left_c)==( need.get(left_c) )){
                        valid--;
                    }
                    window.put(left_c,window.get(left_c)-1);
                }

            }
        }
        return false;
    }
}
