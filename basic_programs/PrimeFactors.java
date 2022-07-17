import java.util.*;
public class PrimeFactors
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int div=2;div*div<=n;div++){ //x=pq => p<=sqrt(x) || q<=sqrt(x)
		    while(n%div==0){
		        System.out.print(div+" ");
		        n=n/div;
		    }
		}
        if(n!=0){
            System.out.println(n);
        }
		scn.close();
	}
}