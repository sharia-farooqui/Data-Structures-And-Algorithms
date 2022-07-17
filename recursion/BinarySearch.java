public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 8, 10, 23, 31, 40};
        int target = 23, start=0, end=arr.length-1;
        int res = search(arr, target, start, end);
        System.out.println(res);
    }
    private static int search(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2; //to avoid integer overflow
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                return search(arr, target, mid+1, end);
            }
            return search(arr, target, start, mid-1);
        }
        return -1;
    }
}
