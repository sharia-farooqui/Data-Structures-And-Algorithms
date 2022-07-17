public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums={1};
        sort(nums);
        int ans = missing(nums);
        System.out.print(" "+ans);
    }
    private static int missing(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]-1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    private static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int element=arr[i];
            if(element>0&&element<=arr.length&&element!=arr[element-1]){ //element>0 cz range 0,1 -> n solving for(1,n)
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

//element<=arr.length ex. {7,8,9,10,11} for elements like these, index will go out of bound; correct index of 7 would be 6, but arr[6] doesn't exist so .. >