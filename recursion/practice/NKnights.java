public class NKnights{
    public static void main(String[] args) {
        int n=3;
        boolean[][] board = new boolean[n][n];
        nKnights(board, 0, 0, n);
    }
    private static void nKnights(boolean[][] board, int row, int col, int cnt){
        if(cnt==0){
            display(board);
            System.out.println();
            return;
        }
        
        if(row==board.length-1 && col==board.length){
            return;
        }
        
        if(col==board.length){
            nKnights(board, row+1, 0, cnt); //instead of loop
            return;
        }
        
        if(isSafe(board, row, col)){
            board[row][col]=true;
            nKnights(board, row, col+1, cnt-1); //instead of loop
            board[row][col]=false;
        }
        
        //if not safe, move ahead
        nKnights(board, row, col+1, cnt);
        
    } 

    private static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col){
            if(isValid(board,row-2,col-1)){ //idx valid?
                if(board[row-2][col-1]){ //element exist?
                    return false;
                }
            }
            if(isValid(board,row-1,col-2)){
                if(board[row-1][col-2]){
                    return false;
                }
            }
            if(isValid(board,row-2,col+1)){
                if(board[row-2][col+1]){
                    return false;
                }
            }
            if(isValid(board,row-1,col+2)){
                if(board[row-1][col+2]){
                    return false;
                }
            }
            return true;
        }
    
    private static boolean isValid(boolean[][] board, int row, int col){
        if(row>=0&&row<board.length&&col>=0&&col<board.length){
            return true;
        }
        return false;
    }
}