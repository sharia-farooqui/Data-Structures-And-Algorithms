public class Factorial {
    public static void main(String[] args) {
        int n=10, p=1;
        for(int i=1;i<=n;i++){
            p=p*i;
        }
        System.out.println(n+"! = "+p);
    }
}
