import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=scn.nextInt();
        }
        int k = scn.nextInt();
        k=k%nums.length; //first
        if(k<0){
            k+=nums.length;
        }

        //RIGHT ROTATION

        // int[] temp = new int[k];
        // int j=0;
        // for(int i=n-k;i<nums.length;i++){
        //     temp[j]=nums[i];
        //     j++;
        // }
        
        // for(int i=nums.length-1-k;i>=0;i--){
        //     nums[i+k]=nums[i];
        // }
        
        // int x=0;
        // for(int i=0;i<k;i++){
        //     nums[i]=temp[x];
        //     x++;
        // }
    
        //ROTATION BY REVERSING

        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }   

    private static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

}
