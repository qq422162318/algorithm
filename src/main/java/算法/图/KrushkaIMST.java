package 算法.图;

import 算法.栈.Queue;
import 算法.树.UF_Tree;
import 算法.树.UF_Tree_Weighted;
import 算法.队列.MinPriorityQueue;

public class KrushkaIMST {
    //保存最小生成树的所有边
    private Queue<Edge> mst;
    //索引代表顶点,使用uf.connect(v,w)可以判断顶点v和顶点w是否在同一棵树中
    //使用uf.union(v,w)可以把顶点v所在的树和顶点w所在的树和顶点w所在的树合并
    private UF_Tree_Weighted uf;
    //存储图中所有的边,使用最小优先队列,对边按照权重进行排序
    private MinPriorityQueue<Edge> pq;

    //根据一副加权无向图,创建最小生成树计算对象
    public KrushkaIMST(EdgeWeightedGraph G){
        //初始化mst
       this.mst=new Queue<>();
        //初始化uf
        this.uf=new UF_Tree_Weighted(G.V());
        this.pq=new MinPriorityQueue<>(G.E()+1);
        for (Edge edge : edges()) {
            pq.insert(edge);
        }
        while (!pq.isEmpty()&&mst.size()<G.V()-1){
            //找到权重最小的边
           Edge e=pq.delMin();
            //找到该边的两个顶点
            int v=e.either();
            int w=e.other(v);
            //判断这两个顶点是否在同一棵树中,如果在同一棵树中不处理,不相同就合并成一棵树
            if (uf.connected(v,w)){
                continue;
            }
            uf.union(v,w);
            //让边e进入到mst队列中
            mst.enqueue(e);
        }
    }
    //获取最小生成树的所有边
    public Queue<Edge> edges(){
        return mst;
    }
}
