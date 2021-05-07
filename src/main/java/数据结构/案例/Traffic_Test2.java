package 数据结构.案例;

import 数据结构.图.DepthFirstSearch;
import 数据结构.图.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Traffic_Test2 {
    public static void main(String[] args) throws IOException {
        //构建一个缓冲读取流BufferedReader
        BufferedReader br=new BufferedReader(new InputStreamReader(Traffic_Test2.class.getClassLoader().getResourceAsStream("数据结构/案例/traffic_project.txt")));
        //读取第一行数据20
        int totalNumber=Integer.parseInt(br.readLine());
        //构建一个Graph对象
        Graph g=new Graph(totalNumber);
        //读取第二行数据7
         int roadNumber=Integer.parseInt(br.readLine());
        //循环读取有限次(7),读取已经修建好的道路
        for (int i = 0; i < roadNumber; i++) {
            String road=br.readLine();
            String[] s = road.split(" ");
            int l1=Integer.parseInt(s[0]);
            int l2=Integer.parseInt(s[1]);
            //调用图的addEdge方法,把边添加到图中,表示已经修建好的道路
            g.addEdge(l1,l2);
        }
        //构建一个深度优先搜索对象,起点设置为顶点9
        DepthFirstSearch search = new DepthFirstSearch(g, 9);

        //调用marked方法,判断8顶点和10顶点是否与起点9相通;
        System.out.println(search.marked(8));
        System.out.println(search.marked(10));

    }
}
