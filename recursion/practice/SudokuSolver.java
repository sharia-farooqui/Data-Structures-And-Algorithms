class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        sudoku(board);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    private static boolean sudoku(char[][] board){
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board.length;col++){
                if(board[row][col]=='.'){
                    for(char n='1';n<='9';n++){
                        if(isValid(board, row, col, n)){
                            board[row][col]=n;
                            if(sudoku(board)==true){
                                return true;
                            }
                            else{
                                board[row][col]='.'; //none is valid so backtrack and restore previous
                            }
                        }
                    }
                    return false; //none is valid from 1-9
                }
            }
        }
        return true;
    }
    
    private static boolean isValid(char[][] board, int row, int col, char n){
        for(int x=0;x<board.length;x++){
            if(board[x][col]==n){
                return false;
            }
            if(board[row][x]==n){
                return false;
            }
            if(board[(3 *(row/3))+x/3][(3*(col/3))+x%3]==n){
                return false;
            } 
        }
        return true;
    }
}