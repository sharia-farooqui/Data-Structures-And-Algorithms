//Iterative
public class Pow{
    public static void main(String[] args) {
        System.out.println(pow(2.00000,-2));
    }
    public static double pow(double x, int n){
        if(n==Integer.MAX_VALUE){
            return x;
        }
        else if(n==Integer.MIN_VALUE){
            return (x==1||x==-1)?1:0;
        }
        double ans=1;
        for(int i=0;i<n;i++){
            ans=ans*x;
        }
        if(n<0){
            return 1/ans;
        }
        return ans;
    }
}