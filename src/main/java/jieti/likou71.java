package jieti;

import java.util.Stack;

public class likou71 {
    public static void main(String[] args) {
      String string="/../";
        String s = simplifyPath(string);
        System.out.println(s);
    }
    public static String SimplifyPath(String path){
        Stack<String> stack = new Stack<>();
        String[] split = path.split("/");
        for (String str: split) {
            if (str.equals("..")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else if (!str.equals("")&&!str.equals(".")){
                stack.add(str);
            }
        }
        if (stack.isEmpty()){
            return "/";
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <stack.size() ; i++) {
            ans.append("/"+stack.get(i));
        }
        return ans.toString();
    }
        public static String simplifyPath(String path) {
            Stack<String> stack=new Stack<>();
            String[] str=path.split("/");
            for(String s:str){
                if(s.equals("..")){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }
                else if(!s.equals("")&&!s.equals(".")){
                    stack.add(s);
                }
            }
            if(stack.isEmpty()){
                return "/";
            }
            StringBuilder stringBuilde=new StringBuilder();
            for(int i=0;i<stack.size();i++){
                stringBuilde.append("/"+stack.get(i));

            }
            return stringBuilde.toString();
        }

}
