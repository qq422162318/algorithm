package 算法.图;

import 算法.栈.Stack;

public class TopoLogical {
    //顶点的拓扑排序
    private Stack<Integer> order;
    //构造拓扑排序对象
    public TopoLogical(Digraph G) {
        //构造一个检测又向环的对象
        DirectedCycle cycle = new DirectedCycle(G);
        //判断G图中有没有环，没有则顶点排序
        if (!cycle.hasCycle()) {
            DepthFirstOrder depthFirstOrder = new DepthFirstOrder(G);
            order = depthFirstOrder.reversePost();
        }
    }
    //判断图中G是否有环
    private boolean isCycle(){
        return order==null;
    }
    //获取拓扑排序的所有顶点
    public Stack<Integer> order(){
        return order;
    }
}
