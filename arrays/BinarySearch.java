public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int target=81;
        int res = search(arr,target);
        System.out.println(res);
    }

    private static int search(int[] arr, int target) {
        int low=0, high=arr.length-1, mid=-1;
        while(low<=high){
            mid=low + (high - low)/2; //avoid overflow
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
        }
        return -1;
    }
}