package 算法题;

import java.lang.String;

import java.util.ArrayList;

public class NwordOrder {
    public static void main(String[] args) {
         String s="LEFTCODEISHIRING";
         int numRows=3;//改行数
        ArrayList<StringBuilder> line = new ArrayList<>();
        if (numRows<2) System.out.println("行数太低了,尼玛币逗我呢");
        for (int i=0;i<numRows;i++){
            line.add(new StringBuilder());}
            int rowline=-1,i=0;
            for (char words:s.toCharArray()){
             line.get(i).append(words);
             if (i==0||i==numRows-1){rowline=-rowline; }
             i+=rowline;
            }
            StringBuilder sr=new StringBuilder();
            for (StringBuilder res:line){
                sr.append(res.toString());
            }
        System.out.println(sr.toString());
        }
    }

