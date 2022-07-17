import java.util.*;
public class AnyToAny {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int dec = sourceBaseToDecimal(n, sourceBase);
        int ans = decimalToDestBase(dec, destBase);
        System.out.println(ans);
        scn.close();
    }

    private static int decimalToDestBase(int n, int base) {
        int exp=1, res=0;
        while(n>0){
            int rem = n%base;
            res = res + rem*exp;
            exp*=10;
            n/=base;
        }
        return res;
    }

    private static int sourceBaseToDecimal(int n, int base) {
        int exp=1, res=0;
        while(n>0){
            int rem = n%10;
            res = res + rem*exp;
            exp*=base;
            n/=10;
        }
        return res;
    } 
}
