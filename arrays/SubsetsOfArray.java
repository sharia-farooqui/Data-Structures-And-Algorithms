import java.util.*;

public class SubsetsOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {10,20,30,40};
        int n = arr.length;
        int subsets = (int)Math.pow(2,n);

        for(int i=0;i<subsets;i++){
            int num = decimalToBinary(i);
            int div = (int)Math.pow(10,n-1);
            for(int j=0;j<n;j++){
                int r = num%div;
                int q = num/div;
                if(q==1){
                    System.out.print(arr[j]+"\t");
                }
                else if(q==0){
                    System.out.print("-\t");
                }
                div/=10;
                num=r;
            }
            System.out.println();
        }

    }
    private static int decimalToBinary(int a){
        int res=0, exp=1;
        while(a>0){
            int rem = a%2;
            a/=2;
            res = res + rem*exp;
            exp*=10;
        }
        return res;
    }
}
