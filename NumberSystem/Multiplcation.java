import java.util.*;
public class Multiplcation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b= scn.nextInt();
        int n1= scn.nextInt();
        int n2= scn.nextInt();
        int ans = getProduct(b, n1, n2);
        System.out.println(ans);
        scn.close();
    }

    private static int getProduct(int b, int n1, int n2){
        int rv=0, exp=1, ans=0;
        while(n2>0){
            int n=n2%10;
            n2/=10;
            rv = getSProduct(b,n1,n);
            ans = getSum(b, ans, rv*exp); //
            exp*=10;
        }
        return ans;
    }

    private static int getSProduct(int b, int n1, int n2){
        int carry=0, exp=1, ans=0;
        while(n1>0||carry>0){
            int l=n1%10;
            n1/=10;
            int d=l*n2+carry;
            carry=d/b;
            d=d%b;
            ans=ans+d*exp;
            exp*=10;
        }
        return ans;
    }

    private static int getSum(int base, int n1, int n2){
        int res=0, carry=0,exp=1;
        while(n1>0 || n2>0 ||carry>0){
            int a=n1%10;
            int b=n2%10;
            int d=a+b+carry;
            n1/=10;
            n2/=10;
            carry=d/base;
            d=d%base;
            res=res+d*exp;
            exp*=10;
        }
        return res;
    }

}