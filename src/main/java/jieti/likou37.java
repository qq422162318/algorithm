package jieti;

/**
 * 37. 解数独
 * 编写一个程序，通过已填充的空格来解决数独问题。
 *
 * 一个数独的解法需遵循如下规则：
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 * 空白格用 '.' 表示。
 */
public class likou37 {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(board);

//        for (char[] chars : board) {
//            System.out.println(chars);;
//        }
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void solveSudoku(char[][] board) {
        if (board==null||board.length==0||board[0].length==0){
            return;
        }
        boolean solve = solve(board);
        System.out.println(solve);
    }
    public static boolean solve(char[][] board){
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                if (board[i][j]=='.'){
                    for(char num='1';num<='9';num++){
                        if (isValid(board,i,j,num)){
                          board[i][j]=num;
                            if(solve(board)) {
                                return true;
                            }else{
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValid(char[][] board,int row,int col,char num){
        for (int k = 0; k <9 ; k++) {
            //判断列存在
            if (board[k][col]==num){
                return false;
            }
            //判断行存在
            if (board[row][k]==num){
                return false;
            }
            if (board[3*(row/3)+k/3][3*(col/3)+k%3]==num){
                return false;
            }
        }
        return true;
    }
}
