import java.util.*;

public class Rotate90D {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        //transpose
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){ //upper or lower triangular matrix to avoid extra swapping
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //reverse
        for(int i=0;i<arr.length;i++){
            int a=0;
            int b=arr.length-1;
            while(a<b){
                int t=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=t;
                a++;
                b--;
            }
        }
        
        display(arr);
    }
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}