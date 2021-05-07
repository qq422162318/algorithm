package 数据结构.图;

import 数据结构.栈.Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//dijstra算法实现
public class DijstraTest {
    public static void main(String[] args) throws Exception {
        //System.out.println(DijstraTest.class.getClassLoader().getResource("算法/图/min_route_test.txt").getPath());
        //创建一副加权有向图
        BufferedReader br=new BufferedReader(new InputStreamReader(DijstraTest.class.getClassLoader().getResourceAsStream("数据结构/图/min_route_test.txt")));
        int total=Integer.parseInt(br.readLine());
        //创建DijstraTest对象,查找最短路径树
        EdgeWeightedDiGraph G = new EdgeWeightedDiGraph(total);
        int edgeNumbers=Integer.parseInt(br.readLine());
        for (int i=1;i<=edgeNumbers;i++){
            String line=br.readLine();
            int i1 = Integer.parseInt(line.split(" ")[0]);
            int l2=Integer.parseInt(line.split(" ")[1]);
            double weight = Double.parseDouble(line.split(" ")[2]);
            DirectedEdge directededge = new DirectedEdge(i1, l2, weight);
            G.addEdge(directededge);
        }
        //查找最短路径
        Dijstra dijstra = new Dijstra(G, 0);
        Queue<DirectedEdge> directedEdges = dijstra.pathTo(6);

        //遍历打印
        for(DirectedEdge edge:directedEdges){
            System.out.println(edge.from()+"->"+edge.to()+"::"+edge.weight());
        }
    }
}
