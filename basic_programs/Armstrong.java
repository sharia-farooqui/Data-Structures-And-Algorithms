/*An Armstrong number is an integer such that the sum of the cubes of its digits is equal 
to the number itself. Example, 371 since 3**3 + 7**3 + 1**3 = 371.*/

import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int d=0;
        int temp=n;
        int sum=0;
        int r;

        //number of digits
        while(temp!=0){
            temp=temp/10;
            d++;
        }
        System.out.println("no. of digits: "+d);

        //sum of nth power of digits
        int temp1=n;
        while(temp1!=0){
            r=temp1%10;
            temp1=temp1/10;
            sum=sum+(int)Math.pow(r,d);
        }

        if(n==sum){
            System.out.println(n + " is an armstrong number");
        }else{
            System.out.println(n + " is not an armstrong number. " + n + "!=" + sum);
        }
    }
}