import java.util.*;

public class BrokenEconomy{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
    }
    int d = scn.nextInt();
    int low=0, high=arr.length-1, mid=-1,ceil=-1,floor=-1;
    while(low<=high){
        mid=low+(high-low)/2;
        if(arr[mid]==d){
            System.out.println(arr[mid]);
            return;
        }
        else if(arr[mid]>d){
            ceil=arr[mid];
            high=mid-1;
        }
        else if(arr[mid]<d){
            floor=arr[mid];
            low=mid+1;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
 }
}