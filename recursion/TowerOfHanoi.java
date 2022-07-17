import java.util.*;
public class TowerOfHanoi {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int t1 = scn.nextInt();
        // int t2 = scn.nextInt();
        // int t3 = scn.nextInt();
        toh(n, 1, 2, 3);
        scn.close();
    }

    public static void toh(int n, int src, int dest, int helper){
        if(n==0){
            return;
        }
        toh(n-1, src, helper, dest);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        toh(n-1, helper, dest, src);
        
    }

}