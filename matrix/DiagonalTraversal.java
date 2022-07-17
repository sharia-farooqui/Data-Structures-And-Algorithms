import java.util.*;
public class DiagonalTraversal {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int diff=0;diff<arr.length;diff++){
            for(int i=0, j=diff;j<arr.length;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}