package 数据结构.图;


import 数据结构.栈.Stack;

public class TopoLogicalTest {
    public static void main(String[] args) {
        Digraph digraph=new Digraph(6);
        digraph.addEdge(0,2);
        digraph.addEdge(0,3);
        digraph.addEdge(2,4);
        digraph.addEdge(3,4);
        digraph.addEdge(4,5);
        digraph.addEdge(1,5);
        TopoLogical topoLogical=new TopoLogical(digraph);
        Stack<Integer> order=topoLogical.order();
        StringBuilder sb=new StringBuilder();
        for (Integer w:order
             ) {
           sb.append(w+"->");
        }
        String s = sb.toString();
        int index = s.lastIndexOf("->");
        String substring = s.substring(0, index);
        System.out.println(substring);
    }
}
