import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        duplicate(nums);
    }
    private static void duplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]-1){
                System.out.print(" "+nums[i]);
            }
        }
    }
    private static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int element=arr[i];
            if(element!=arr[element-1]){
                swap(arr,i,element-1);
            }
            else{
                i++;
            }
        }
    }
    private static void swap(int[] arr, int a, int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
}