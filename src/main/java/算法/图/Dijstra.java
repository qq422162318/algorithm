package 算法.图;

import 算法.栈.Queue;
import 算法.队列.IndexMinPriorityQueue;

public class Dijstra {
    //索引代表顶点,值表示从顶点s到当前顶点的最短路径上的最后一条边
    private DirectedEdge[] edgeTo;
    //索引代表顶点,值从顶点s到当前顶点的最短路径的总权重
    private double[] distTo;

    //存放树中顶点与非树中顶点之间的有效横切边
    private IndexMinPriorityQueue<Double> pq;

    //根据一副加权有向图G和顶点s,创建一个计算定点为s的最短路径树对象
    public Dijstra(EdgeWeightedDiGraph G,int s){
        //创建一个和图的顶点数一样大小的DirectedEdge数组,表示边
        this.edgeTo=new DirectedEdge[G.V()];
        //创建一个和图的顶点数一样大小的double数组,表示权重,并且初始化数组中
        //内容为无穷大,无穷大即表示不存在这样的边
        this.distTo=new double[G.V()];
        for (int i = 0; i < distTo.length; i++) {
            distTo[i]=Double.POSITIVE_INFINITY;
        }
        //创建一个和图的顶点数一样大小的索引优先队列,存储有效横切边
        this.pq=new IndexMinPriorityQueue<>(G.V());
        //默认让顶点s进入树中,但s顶点目前没有与树中其他的顶点相连接,因此初始化distTo[s]=0.0
        distTo[s]=0.0;
        //使用顶点s和权重0.0初始化pq
        pq.insert(s,0.0);
        //遍历有效边队列
        while(!pq.isEmpty()){
            //松弛图G中的顶点
            relax(G,pq.delMin());
        }
    }
    //松弛图G中的顶点v
    private void relax(EdgeWeightedDiGraph G, int v) {
        //松弛顶点v就是松弛顶点v邻接表中的每一条边,遍历邻接表
        for (DirectedEdge e:G.adj(v)) {
            //获取边e的终点
            int w=e.to();
            //通过松弛技术,判断从起点s到顶点w的最短路径是否需要先从顶点s到顶点v
            //然后再由顶点v到顶点w
            if (distTo(v)+e.weight()<distTo(w)){
                distTo[w]=distTo[v]+e.weight();
                edgeTo[w]=e;

                //判断pq中是否已经存在顶点w,如果存在,则需要更新权重,
                if (pq.contains(w)){
                    pq.changeItem(w,distTo[w]);
                }else{
                    pq.insert(w,distTo[w]);
                }
            }
        }
    }
    //获取从顶点s到顶点v的最短路径的总权重
    private double distTo(int v) {
        return distTo[v];
    }
    //判断从顶点s到顶点v是否可达
    public boolean hasPathTo(int v){
        return distTo[v]<Double.POSITIVE_INFINITY;
    }
    //查询从起点s到顶点v的最短路径中所有的边
    public Queue<DirectedEdge> pathTo(int v){
        //判断从顶点s到顶点v是否可达
        if (!hasPathTo(v)){
            return null;
        }
        //创建队列对象
        Queue<DirectedEdge> allEdges=new Queue<>();
        while(true){
            DirectedEdge e=edgeTo[v];
            if (e==null){
                break;
            }
            allEdges.enqueue(e);
            v=e.from();
        }
        return allEdges;
    }
}
