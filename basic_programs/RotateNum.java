import java.util.*;
public class RotateNum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        int k=scn.nextInt();

        int digits=0, temp=num;
        while(temp>0){
            temp=temp/10;
            digits++;
        }

        k=k%digits;     //k>digits
        if(k<0){     
            k=k+digits;
        }

        int mult=1, div=1;
        for(int i=1;i<=digits;i++){
            if(i<=k){
                div=div*10;
            }
            else{
                mult=mult*10;
            }
        }
        int rem=num%div;
        int q=num/div;
        int res=(rem*mult)+q;
        System.out.println(res);
        scn.close();
    }
}