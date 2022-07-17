public class HCF{
    public static void main(String[] args){
        int n1=12,n2=32, i;
        int low;
        if(n1>n2)
            low=n2;
        else
            low=n1;
        // for(int i=1;i<=low;i++){
        //     if(n1%i==0&&n2%i==0){
        //         System.out.println("HCF: "+i);
        //     }
        // }
        // } this method prints all common factors of num1 and num2.
        for(i=low;i>=1;i--){
            if(n1%i==0&&n2%i==0){
                System.out.println("HCF: "+i);
                break;
            }
        }
        //lcm by formula if you know hcf:
        int lcm=(n1*n2)/i;
        System.out.println("LCM: "+lcm);
    }
}