//Saddle Point or Lucky Number of a matrix is defined as the least val in the row but max value in the col.

import java.util.*;

public class SaddlePoint {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            int min=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<arr[i][min]){
                    min=j;//min->[i][min]
                }
            }
            boolean flag = true; //assume to be max in col
            for(int x=0;x<arr.length;x++){
                if(arr[x][min]>arr[i][min]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(arr[i][min]);
                return;
            }
        }
        System.out.println("Invalid input");
    }

}