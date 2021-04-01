package 算法题;
/**
 * 36. 有效的数独
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 */
public class likou36 {
    public static void main(String[] args) {
        System.out.println(2 / 3);
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
        boolean isreal = isreal(board);
        System.out.println(isreal);
    }
    public static boolean isreal(char[][] board){
        boolean[][] row=new boolean[9][9];
        boolean[][] col=new boolean[9][9];
        boolean[][] box=new boolean[9][9];

        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                if( board[i][j] !='.'){
                    int num=board[i][j]-'1';
                    int boxIndex=i/3*3+j/3;
                    if (row[i][num]||col[j][num]||box[boxIndex][num]){
                        return false;
                    }else{
                        row[i][num]=true;
                        col[j][num]=true;
                        box[boxIndex][num]=true;
                    }
                }
            }
        }
        return true;
    }
}
