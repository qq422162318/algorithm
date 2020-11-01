package jieti;
/**
 * 200. 岛屿数量
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 * 示例 1:
 * 输入:
 * [
 * ['1','1','1','1','0'],
 * ['1','1','0','1','0'],
 * ['1','1','0','0','0'],
 * ['0','0','0','0','0']
 * ]
 * 输出: 1
 * 示例 2:
 * 输入:
 * [
 * ['1','1','0','0','0'],
 * ['1','1','0','0','0'],
 * ['0','0','1','0','0'],
 * ['0','0','0','1','1']
 * ]
 * 输出: 3
 * 解释: 每座岛屿只能由水平和/或竖直方向上相邻的陆地连接而成。
 */
public class likou200 {
    public static void main(String[] args) {
     char[][] chars=new char[][]{
             {'1','1','0','0','0'},
             {'1','1','0','0','0'},
             {'0','0','1','0','0'},
             {'0','0','0','1','1'}
     };
        likou200 likou200 = new likou200();
        int i = likou200.numIslands(chars);
        System.out.println(i);
    }
    public int numIslands(char[][] grid){
       if (grid==null||grid.length==0){
           return 0;
       }
       int nr=grid.length;
       int nc=grid[0].length;
       int num_isLands=0;
        for (int i = 0; i <nr ; i++) {
            for (int j = 0; j <nc ; j++) {
                if (grid[i][j]=='1'){
                    ++num_isLands;
                    dfs(grid,i,j);
                }
            }
        }
         return num_isLands;
    }
    public void dfs(char[][] grid,int i,int j){
        int nr=grid.length;
        int nc=grid[0].length;
        if (i<0||j<0||i>=nr||j>=nc||grid[i][j]!='1') {
            return;
        }
        grid[i][j]='0';
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
}
