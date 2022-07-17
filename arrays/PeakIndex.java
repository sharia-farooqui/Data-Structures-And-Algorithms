public class PeakIndex{
    public static void main(String[] args) {
        int[] arr={24,69,78,88,100,99,79};
        int ans=search(arr);
        System.out.println(ans);  
    }
    private static int search(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(mid>0&&mid<arr.length){ //checking whether the index i.e. mid is > 0 index and less than length of array.
                if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                    return mid;
                }
                else if(arr[mid]<arr[mid-1]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(mid==0){
                if(arr[mid]>arr[mid+1]){
                    return mid;
                }
                else{
                    return mid+1;
                }
            }
            else if(mid==arr.length-1){
                if(arr[mid]>arr[mid-1]){
                    return mid;
                }
                else{
                    return mid-1;
                }
            }
        }
        return mid;
    }
}