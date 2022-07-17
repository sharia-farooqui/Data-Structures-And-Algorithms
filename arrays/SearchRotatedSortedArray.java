public class SearchRotatedSortedArray{
    public static void main(String[] args) {
        int[] arr={1,3};
        int target=3;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    private static int search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>=arr[start]){ //asc
                if(target>=arr[start]&&target<=arr[mid]){
                    end=mid-1;
                }
                else{ //find in unsorted right array
                    start=mid+1;
                }
            }
            else{
                if(target>=arr[mid]&&target<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
                
            }
            
        }
        return -1;
    }
}