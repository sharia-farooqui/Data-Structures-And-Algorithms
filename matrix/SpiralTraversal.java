import java.util.*;

public class SpiralTraversal {

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
      int minc=0, maxc=arr[0].length-1, minr=0, maxr=arr.length-1, cnt=0, total=r*c;
      while(cnt<total){
        for(int i=minr, j=minc; i<=maxr && cnt<total;i++){
          System.out.println(arr[i][j]);
          cnt++;
        }
        minc++;
        for(int i=maxr, j=minc; j<=maxc && cnt<total; j++){
          System.out.println(arr[i][j]);
          cnt++;
        }
        maxr--;
        for(int i=maxr, j=maxc; i>=minr && cnt<total; i--){
          System.out.println(arr[i][j]);
          cnt++;
        }
        maxc--;
        for(int j=maxc, i=minr; j>=minc && cnt<total;j--){  //cnt<total, to avoid duplicate elements of last internal box, it may not have all 4 walls
          System.out.println(arr[i][j]);
          cnt++;
        }
        minr++;
      }
      
    }

}