import java.util.*;
public class BaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
     }
    
     public static int getValueIndecimal(int n, int b){
        int exp=1,res=0;
        while(n>0){
           int rem = n%10;
           res += rem*exp;
           n/=10;
           exp=exp*b;
        }
        return res;
     }
}
