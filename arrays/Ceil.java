public class Ceil {
    public static void main(String[] args) {
        int[] arr={5,14,23,37,44,49,51,69,73,77,79,102};
        int target=47;
        search(arr,target);
    }
    private static int search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int res=0;
        if(arr[start]<arr[end]){
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==target){
                    System.out.println("Ceil of " + target + " : "+arr[mid]);
                    return 0;
                }
                else if(arr[mid]>target){
                    res=arr[mid];
                    end=mid-1;
                }
                else if(arr[mid]<target){
                    start=mid+1;
                }
            }
            System.out.println("Ceil of " + target + " : "+res);
        }
        else{
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]>target){
                    start=mid+1;
            }
                else if(arr[mid]<target){
                    end=mid-1;
            }
                else if(arr[mid]==target){
                    System.out.println(target + " found "+"at index : "+mid);
                    return 0;
            }
            }
        }
        return 0;
    }
}