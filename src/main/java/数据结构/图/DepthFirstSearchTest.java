package 数据结构.图;

public class DepthFirstSearchTest {
    public static void main(String[] args) {
        Graph g=new Graph(13);
        g.addEdge(0,5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,6);
        g.addEdge(5,3);
        g.addEdge(5,4);
        g.addEdge(3,4);
        g.addEdge(4,6);
        g.addEdge(7,8);
        g.addEdge(9,11);
        g.addEdge(9,10);
        g.addEdge(9,12);
        g.addEdge(11,12);
        //深度优先搜索对象
        BreadFirstSearch search = new BreadFirstSearch(g, 0);
        //测试与某个顶点相通的定点数量
        int count = search.count();
        System.out.println(count);
        //测试某个顶点与起点是否相同
        boolean marked = search.marked(5);
        System.out.println(marked);
        boolean marked1 = search.marked(7);
        System.out.println(marked1);
        System.out.println();
    }

}
