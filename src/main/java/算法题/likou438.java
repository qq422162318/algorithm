package 算法题;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jdk.xml.internal.SecuritySupport;
import sun.awt.AWTAccessor.SystemColorAccessor;

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
