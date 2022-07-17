import java.util.*;
  
  public class Subtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int base = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(base, n1, n2);
      System.out.println(d);
      scn.close();
   }
  
   public static int getDifference(int base, int n1, int n2){
       int exp=1, res=0, flag=0, d=0;
       while(n2>0){ //greater
           int a=n2%10;
           int b=n1%10;
           n1/=10;
           n2/=10;
           if(flag==1){
               a--;
           }
           if(a<b){
               a+=base;
               flag=1;
           }
           else if(a>=b){
                flag=0;
            }
           d=a-b;
           res=res+d*exp;
           exp*=10;   
       }
       return res;
   }
}

//modulus of a num < modulus, gives num itself while greater gives remainder.