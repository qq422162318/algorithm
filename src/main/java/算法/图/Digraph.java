package 算法.图;

import 算法.栈.Queue;
//有向图实现
public class Digraph {
    //顶点数目
    private final int V;
    //边的数目
    private int E;
    //邻接表
    private Queue<Integer>[] adj;
    public Digraph(int V){
        //初始化顶点数量
        this.V=V;
        //初始化边的数量
        this.E=0;
        //初始化邻接表
        this.adj=new Queue[V];
        for (int i = 0; i < adj.length; i++) {
            adj[i]=new Queue<>();//给每个邻接表创建一个队列
        }
    }
    public int V(){
        return V;
    }
    public int E(){
        return E;
    }
    public void addEdge(int v,int w){
      adj[v].enqueue(w);
      E++;
    }
    public Queue<Integer> adj(int v){
        return adj[v];//返回adj队列
    }
    //进行反转
    private Digraph reverse(){
        Digraph r=new Digraph(V);
        for (int v = 0; v < V; v++) {
            for (Integer w :adj(v)
                    ) {
                r.addEdge(w,v);
            }
        }
        return r;
    }
}
