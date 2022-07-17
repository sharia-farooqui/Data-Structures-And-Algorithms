import java.util.*;

public class ExitPoint {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int i=0, j=0, dir=0;
        
        while(true){
            dir=(dir+arr[i][j])%4;
            if(dir==0){//east
                j++;
            }
            else if(dir==1){//south
                i++;
            }
            else if(dir==2){//west
                j--;
            }
            else if(dir==3){//north
                i--;
            }

            if(i<0){
                i++;
                break;
            }
            else if(i==r){
                i--;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(j==c){
                j--;
                break;
            }

        }

        System.out.println(i);
        System.out.println(j);
        
        
    }

}