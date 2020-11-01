package 算法.栈;

public class BracketsMatchTest {
    public static void main(String[] args){
        String str="(上海(长安)())";
        boolean match=isMatch(str);
       System.out.println(str+"中的括号是否匹配"+match);
    }
    /**
     * 判断str中的括号是否匹配
     * @param str
     * @return
     */
    public static boolean isMatch(String str){
        //创建栈对象,用来存储左括号
        Stack<String> chars=new Stack<>();
        //从左往右遍历字符串
        for (int i = 0; i < str.length(); i++) {
            String currChar=str.charAt(i)+"";
            //如果当前字符为左括号,就把字符压入栈中
        if(currChar.equals("(")){
            chars.push(currChar);
            //右括号就压入栈
        }else if(currChar.equals(")")){
           String pop=chars.pop();
           if(pop==null){
               return false;
           }
        }
        }
        if(chars.size()==0){
            return true;
        }else{
            return false;
        }
        
    }
    
}
