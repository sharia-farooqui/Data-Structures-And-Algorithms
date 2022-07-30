import java.util.*;
public class MatrixMazePath
{
	public static void main(String[] args) {
	    boolean[][] arr = {
	        {true, true, false},
            {true, true, true},
            {true, false, true}
	    };
	    int[][] res = new int [arr.length][arr[0].length];
	    print("", arr, 0, 0, res, 1);
	}
	private static void print(String str, boolean[][] maze, int r, int c, int[][] res, int step){
	    
	    
	    if(r==maze.length-1&&c==maze[0].length-1){
	        //maze
	        res[r][c]=step;
	        System.out.println(str);
	        for (int[] row : res)
	            System.out.println(Arrays.toString(row));
	       System.out.println();
	        return;
	    }
	    
	    if(maze[r][c]==false){
	        return;
	    }
	    
	    maze[r][c]=false;
	    res[r][c]=step;
	    
	    if(r<maze.length-1){
	        print(str+'D', maze, r+1, c, res, step+1);
	    }
	    if(c<maze[0].length-1){
	        print(str+'R', maze, r, c+1, res, step+1);
	    }
	    if(r>0){
	        print(str+'U', maze, r-1, c, res, step+1);
	    }
	    if(c>0){
	        print(str+'L', maze, r, c-1, res, step+1);
	    }
	    
	    maze[r][c]=true;
	    res[r][c]=0;
	}
}
