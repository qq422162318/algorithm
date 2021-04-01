package 算法题;

import java.util.ArrayList;
import java.util.List;

//括号组合
public class kuohaozuhe{
    public static void main(String[] args) {
        List<String> res=new ArrayList<>();
        int n=3;String str="";
        dfs(n,n,str,res);
    }

    private static void dfs(int left, int right, String str,List<String> res) {

        if (left==0&&right==0){
            res.add(str);
            return ;
        }
        if (left>0){
            dfs(left-1,right,str+"(",res);
        }
        if (right>0){
            dfs(left, right-1, str+")",res);
        }
//        for (String s:res
//             ) {
//            System.out.println(s+" ");
//        }
    }


}
