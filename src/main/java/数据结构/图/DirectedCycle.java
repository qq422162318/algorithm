package 数据结构.图;
//检测又向环
public class DirectedCycle {
    //索引代表顶点,值表示当前顶点是否已经被搜索
    private boolean[] marked;
    //记录图中是否有环
    private boolean hasCycle;
    //索引代表顶点,使用栈的思想,记录当前顶点有没有已经处于正在搜索的有向路径上
    private boolean[] onStack;
    //创建一个检测环对象,检测图G中是否有环
    public DirectedCycle(Digraph G){
        //初始化marked数组
        this.marked=new boolean[G.V()];
        //初始化hascycle
        this.hasCycle=false;
        //初始化onstack数组
        this.onStack=new boolean[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]){
                dfs(G,v);
            }
        }
    }
    //基于深度优先搜索,检测图G中是否有环
    private void dfs(Digraph G,int v){
     marked[v]=true;
     onStack[v]=true;
        for (Integer w:G.adj(v)) {
            if (!marked[w])
            dfs(G,w);
            if (onStack[w]){
                hasCycle=true;
                return;
            }
        }
        onStack[v]=false;
    }
    //判断w顶点是否与s顶点相通
    public boolean hasCycle(){
        return false;
    }
}
