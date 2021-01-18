package 数据结构.图;

import java.util.LinkedList;
import java.util.Queue;

//图的搜索
public class unGraph {
    //顶点个数
     private int points;
     //邻接表
     private LinkedList<Integer> adj[];
     public unGraph(int points){
         this.points=points;
         //初始化数组
         adj=new LinkedList[this.points];
         //初始化数组中每一个槽位链表
         for (int i=0;i<this.points;i++){
             adj[i]=new LinkedList<Integer>();
         }
     }

     public void addPoint(int s,int t){
         adj[s].add(t);
         adj[t].add(s);
     }
    //广度优先搜索,s起点,t终点
    public void bfs(int s,int t){
         if (s==t){
             return;
         }
         boolean[] visited=new boolean[this.points];
         visited[s]=true;
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.add(s);
        //定义一个数组存储s-t的线路
        int[] pre=new int[this.points];
        for (int i=0;i<pre.length;i++){ pre[i]=-1; }
        //循环队列中没有被访问过的顶点
        while(!queue.isEmpty()){
            Integer pollnum = queue.poll();
            for (int j = 0; j < adj[pollnum].size(); j++) {
                //取出起点的邻接表中的边
                Integer pedge = adj[pollnum].get(j);
                //如果没被访问过就赋值
                if (!visited[pedge]){
                    pre[pedge]=pollnum;
                    //如果该边等于终点线路
                    if (pedge==t){ print(pre,s,t);return; }
                    visited[pollnum]=true;
                    queue.add(pedge);
                }
            }
        }
    }
    public void print(int[] prev,int s,int t){
         if (prev[t]!=-1&&s!=t){
             print(prev,s,prev[t]);
         }
        System.out.println(t+">>");
    }
    private boolean found=true;
     public void dfs(int s,int t){
         if (s==t){
             return;
         }
         boolean[] visited=new boolean[this.points];
         visited[s]=true;
         int[] prv=new int[this.points];
         for (int i = 0; i < prv.length; i++) {
             prv[i]=-1;
         }
         returnDFS(s,t,visited,prv);
         print(prv,s,t);
     }

    /**
     * 查找顶点point到我们目标顶点线路
     * @param point 顶点point
     * @param target 目标定点
     * @param visited 已经被访问的顶点和数组
     * @param prev 顶点线路数组
     */
     private void returnDFS(int point,int target,boolean[] visited,int[] prev){
         if (found){
             return;
         }
         //标记当前顶点已经被访问过
         visited[point]=true;
         //若当前顶点就是目标顶点
         if (point==target){
             found=true;
             return;
         }
         //获取当前顶点相连接的所有顶点
         for (int j=0;j<adj[point].size();j++){
             //当前与顶点point相连的顶点
             Integer p_conect=adj[point].get(j);
             if (!visited[p_conect]){
                 //记录p_conect之前的顶点是p
                 prev[p_conect]=point;
                 //递归
                 returnDFS(p_conect,target,visited,prev);
             }
         }

     }
    public static void main(String[] args) {
        unGraph unGraph=new unGraph(8);
        unGraph.addPoint(0,1);
        unGraph.addPoint(0,3);
        unGraph.addPoint(1,2);
        unGraph.addPoint(1,4);
        unGraph.addPoint(2,5);
        unGraph.addPoint(3,4);
        unGraph.addPoint(4,5);
        unGraph.addPoint(4,6);
        unGraph.addPoint(6,7);
        unGraph.addPoint(7,5);
        unGraph.bfs(0,6);
        System.out.println(unGraph);
    }

}
