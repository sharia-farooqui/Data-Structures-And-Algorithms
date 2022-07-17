public class FirstLastPosition{
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8,10};
        int target=7;
        int lower = search(arr,target,true);
        int upper = search(arr,target,false);
        System.out.println(lower + " and " + upper);
    }
    
    private static int search(int[] arr, int target, boolean bound) {
        int start=0;
        int end=arr.length-1;
        int x=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                if(bound){
                    x=mid;
                    end=mid-1;
                }
                else{
                    x=mid;
                    start=mid+1;
                }
            }
        }
        return x;
    }
}