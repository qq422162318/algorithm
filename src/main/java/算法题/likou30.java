package 算法题;

import java.util.*;

public class likou30 {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        List<Integer> substring = findSubstring(s, words);
        for (Integer integer : substring) {
            System.out.println(integer);
        }
    }
    public static List<Integer> findSubstrings(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0)
            return res;
        HashMap<String, Integer> map = new HashMap<>();
        int one_word = words[0].length(),word_num = words.length,all_len = one_word * word_num;
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i < s.length() - all_len + 1; i++) {
            String tmp = s.substring(i, i + all_len);
            HashMap<String, Integer> tmp_map = new HashMap<>();
            for (int j = 0; j < all_len; j += one_word) {//遍历 加一组数据长度+3
                String w = tmp.substring(j, j + one_word);//substring(0,i-1)
                tmp_map.put(w, tmp_map.getOrDefault(w, 0) + 1);
            }
            if (map.equals(tmp_map)) res.add(i);
        }
        return res;
    }
    public static List<Integer> findSubstring(String s,String[] words){

        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) return list;
        int one_word=words[0].length(),all_word=one_word*words.length;
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) { map.put(word,map.getOrDefault(word,0)+1); }
        for (int i = 0; i <=s.length()-all_word ; i++) {
            String temp=s.substring(i,all_word+i);
            //System.out.println(temp);
            HashMap<String,Integer> temp_map = new HashMap<>();
            for (int j = 0; j <all_word ; j+=one_word) {
                String ww=temp.substring(j,j+one_word);
                //System.out.println(ww);
                temp_map.put(ww,temp_map.getOrDefault(ww,0)+1);
            }
            if (map.equals(temp_map)) list.add(i);

        }
        return list;
    }
}
