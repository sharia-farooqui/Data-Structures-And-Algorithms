import java.util.*;
public class DecimalToBase{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
     }
    
     public static int getValueInBase(int n, int b){
         int exp=0, res=0;
         while(n>0){
             int r=n%b;
             res = res + r*((int)Math.pow(10,exp));
             n=n/b;
             exp++;
         }
         return res;
     }
}