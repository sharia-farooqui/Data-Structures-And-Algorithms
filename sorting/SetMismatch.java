import java.util.Arrays;
public class SetMismatch {
    public static void main(String[] args) {
        int[] nums={1,1};
        sort(nums);
        int[] ans = duplicate_missing(nums);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] duplicate_missing(int[] nums) {
        int[] ans = {-1,-1};
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]-1){
                ans[0]=nums[i]; //duplicate
                ans[1]=i+1; //missing
                return ans;
            }
        }
        return ans;
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