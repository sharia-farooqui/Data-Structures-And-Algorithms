public class Duplicate {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        sort(nums);
        // System.out.println(Arrays.toString(nums));
        int ans = duplicate(nums);
        System.out.println(" "+ans);
    }
    private static int duplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]-1){
                return nums[i];
            }
        }
        return 0;
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