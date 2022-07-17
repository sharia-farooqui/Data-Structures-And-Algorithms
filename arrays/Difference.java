import java.io.*;
import java.util.*;

public class Difference{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] a = new int[n1];
    for(int i=0;i<n1;i++){
        a[i]=scn.nextInt();
    }

    int n2 = scn.nextInt();
    int[] b = new int[n2];
    for(int i=0;i<n2;i++){
        b[i]=scn.nextInt();
    }

    int[] sum = new int[n2]; //assume n2 to be greater num

    int i=n1-1, j=n2-1, k=sum.length-1, c=0, d=0;

    while(k>=0){
        int aiv=(i<0)?0:a[i];

        if(b[j]+c>=aiv){
            d=b[j]+c-aiv;
            c=0;
        }
        else if(b[j]+c<aiv){
            d=b[j]+c+10-aiv;
            c=-1;
        }
        sum[k]=d;
        i--;
        j--;
        k--;
    }

    int idx=0;
    while(idx<sum.length){
        if(sum[idx]==0){
            idx++;
        }else{
            break;
        }
    }
    
    while(idx<sum.length){
        System.out.println(sum[idx]);
        idx++;
    }
    
 }

}