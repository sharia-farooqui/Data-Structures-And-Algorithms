import java.util.*;

public class RingRotate {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int shell = scn.nextInt();
        int r = scn.nextInt();

        //shell to one 1D
        
        int minc=shell-1, minr=shell-1, maxr=n-shell, maxc=m-shell;
        int size = 2*(maxr-minr)+2*(maxc-minc); 
        // 2*(maxr-minr+1)+2*(maxc-minc+1)-4; htl->+1
        int[] temp = new int[size];
        int t=0;

        for(int i=minr,j=minc; i<=maxr; i++){
            temp[t]=arr[i][j];
            t++;
        }
        minc++;
        for(int i=maxr,j=minc;j<=maxc;j++){
            temp[t]=arr[i][j];
            t++;
        }
        maxr--;
        for(int i=maxr,j=maxc;i>=minr; i--){
            temp[t]=arr[i][j];
            t++;
        }
        maxc--;
        for(int i=minr, j=maxc;j>=minc;j--){
            temp[t]=arr[i][j];
            t++;
        }
        minr++;

        rotate(temp,r);

        onedToShell(temp, arr, shell, m, n);

        display(arr);
        scn.close();
    }

    public static void onedToShell(int[] temp, int[][] arr, int shell, int m, int n){
        int minc=shell-1, minr=shell-1, maxr=n-shell, maxc=m-shell, x=0;
        for(int i=minr,j=minc; i<=maxr; i++){
            arr[i][j]=temp[x];
            x++;
        }
        minc++;
        for(int i=maxr,j=minc;j<=maxc;j++){
            arr[i][j]=temp[x];
            x++;
        }
        maxr--;
        for(int i=maxr,j=maxc;i>=minr; i--){
            arr[i][j]=temp[x];
            x++;
        }
        maxc--;
        for(int i=minr, j=maxc;j>=minc;j--){
            arr[i][j]=temp[x];
            x++;
        }
        minr++;
    }

    public static void rotate(int[] temp, int r){
        r=r%temp.length;
        if(r<0){
            r=r+temp.length;
        }
        reverse(temp,0,temp.length-r-1);
        reverse(temp,temp.length-r,temp.length-1);
        reverse(temp,0,temp.length-1);
    }

    public static void reverse(int[] temp, int i, int j){
        while(i<j){
            int t=temp[i];
            temp[i]=temp[j];
            temp[j]=t;
            i++;
            j--;
        }
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