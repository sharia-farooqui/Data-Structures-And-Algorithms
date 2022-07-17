public class Prime{
    public static void main(String[] args) {
        int n=23, count=0;
        for(int div=2;div*div<=n;div++){
            if(n%div==0){
                count++;
                break;
            }
        }
        if(count==1){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}