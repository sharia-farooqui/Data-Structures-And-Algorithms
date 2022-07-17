import java.util.*;
public class SumofTwoArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1=scn.nextInt();
        int[] a=new int[n1];
        for(int x=0;x<n1;x++){
            a[x]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int[] b=new int[n2];
        for(int x=0;x<n2;x++){
            b[x]=scn.nextInt();
        }

        int[] sum=new int[n1>n2?n1:n2];

        int i=n1-1, j=n2-1, carry=0, k=sum.length-1;

        while(i>=0||j>=0){
            int d=0;
            d=d+carry; 

            if(i>=0){//check if 'i' idx exists or not, if idx exists value will also exist
                d+=a[i];
            }
            if(j>=0){
                d+=b[j];
            }
            carry=d/10;
            d=d%10;

            sum[k]=d;
            i--;
            j--;
            k--;
        }
        if(carry>0){
            System.out.println(carry);
        }
        for(int x=0;x<sum.length;x++){
            System.out.println(sum[x]);
        }

    }
}
