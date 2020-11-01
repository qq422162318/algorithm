package jieti;

import java.util.Stack;

public class mathch {
    public static void main(String[] args) {
        String[] s={"{","}","[","]","(",")"};
        System.out.println(isValid(s));
    }
    public static  boolean isValid(String[] s){
        Stack<String> stack=new Stack<>();


        for (String c:s) {
            if (c=="("){stack.push(")");}
            else if (c=="{"){stack.push("}");}
            else if (c=="["){stack.push("]");}
            else if(stack.isEmpty()||c!=stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
