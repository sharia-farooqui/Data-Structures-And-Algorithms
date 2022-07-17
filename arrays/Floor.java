public class Floor{
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        // int[] arr={18,16,14,9,5,3,2};
        int target=15;
        search(arr,target);
    }
    private static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int res=0;
        if(arr[start]<arr[end]){ //asc
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==target){
                    System.out.println("Floor element is : "+arr[mid]);
                    return 0;
                }
                else if(arr[mid]<target){
                    res=arr[mid];
                    start=mid+1;
                }
                else if(arr[mid]>target){
                    end=mid-1;
                }
            }
            System.out.println("Floor element is : "+res);
        }
        else{ //desc
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==target){
                    System.out.println("Floor element is : "+arr[mid]);
                    return 0;
                }
                else if(arr[mid]<target){
                    res=arr[mid];
                    end=mid-1;
                }
                else if(arr[mid]>target){
                    start=mid+1;
                }
            }
            System.out.println("Floor element is : "+res);
        }
        return 0;
    }
}