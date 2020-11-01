package 算法.栈;

import 算法.栈.Stack;
//import java.util.Stack;
public class PolandTest{
    public static void main(String[] args){
        String[] notation={"3","17","15","-","*","18","6","/","+"};
        int result=caculate(notation);
        System.out.println("逆波兰表达式的结果为"+result);
    }
    public static int caculate(String[] notaion){
        //1.定义一个栈,用来存储操作数
        Stack<Integer> integerStack=new Stack<>();
        //2.从左到右遍历波兰表达式,得到每一个元素
        for (int i = 0; i < notaion.length; i++) {
            String curr=notaion[i];
            Integer o1;
            Integer o2;
            Integer result=null;

            //3.判断当前元素是运算符还是操作数
            switch(curr){
                case "+":
                    o1=integerStack.pop();
                    o2=integerStack.pop();
                    result=o2+o1;
                    integerStack.push(result);
                    break;
                case "-":
                    o1=integerStack.pop();
                    o2=integerStack.pop();
                    result=o2-o1;
                    integerStack.push(result);
                    break;
                case "*":
                    o1=integerStack.pop();
                    o2=integerStack.pop();
                    result=o2*o1;
                    integerStack.push(result);
                    break;
                case "/":
                    o1=integerStack.pop();
                    o2=integerStack.pop();
                    result=o2/o1;
                    integerStack.push(result);
                    break;
                default:
                    //4.如果是操作数压入栈中
                    integerStack.push(Integer.parseInt(curr));
                    break;
            }

        }
        int result=integerStack.pop();
        return result;

        //5.得到栈中最后一个元素就是结果
    }
}