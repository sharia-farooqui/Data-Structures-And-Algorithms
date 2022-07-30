public class PrintMazePaths{
    public static void main(String[] args) {
        print("",3,3);
        System.out.println();
        printII("",3,3);
        boolean[][] arr = {
          {true,true,true},
          {true,false,true},
          {true,true,true}  
        };
        System.out.println();
        MazeWithObstacles("", arr, 0, 0);
    }
    private static void print(String str, int r, int c){
        if(r==1 && c==1){
            System.out.println(str);
            return;
        }
        if(r>1){
            print(str+'V', r-1, c);
        }
        if(c>1){
            print(str+'H', r, c-1);
        }
    }
    
    private static void printII(String str, int r, int c){
        if(r==1 && c==1){
            System.out.println(str);
            return;
        }
        if(r>1){
            printII(str+'V', r-1, c);
        }
        if(r>1 && c>1){
            printII(str+'D', r-1, c-1);
        }
        if(c>1){
            printII(str+'H', r, c-1);
        }
    }

    private static void MazeWithObstacles(String str, boolean[][] mat, int r, int c){
        if(r==mat.length-1 && c==mat[0].length-1){
            System.out.println(str);
            return;
        }
        if(mat[r][c]==false){
            return;
        }
        if(r<mat.length-1){
            MazeWithObstacles(str+'V', mat, r+1, c);
        }
        if(c<mat[0].length-1){
            MazeWithObstacles(str+'H', mat, r, c+1);
        }
    }

}