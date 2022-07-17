public class Fibo {
    public static void main(String[] args) {
        int ans = fib(5);
        System.out.println(ans);
    }
    private static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
