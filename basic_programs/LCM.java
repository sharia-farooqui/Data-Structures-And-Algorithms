public class LCM {
    public static void main(String[] args){
        int n1=12,n2=16, i,high;
        if(n1>n2)
            high=n1;
        else
            high=n2;
        for(i=high;i<=n1*n2;i++){
            if(i%n1==0&&i%n2==0){
                System.out.println("LCM: "+i);
                break;
            }
        }
    }
}
