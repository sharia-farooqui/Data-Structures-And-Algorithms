import java.util.*;
public class Addition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter base : ");
        int base = scn.nextInt();
        System.out.print("Enter num1 : ");
        int n1 = scn.nextInt();
        System.out.print("Enter num2 : ");
        int n2 = scn.nextInt();
        int d = getSum(base, n1, n2);
        System.out.println(d);
        scn.close();
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