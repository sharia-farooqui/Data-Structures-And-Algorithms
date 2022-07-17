public class SmallestLetter{
    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        int target=(int)'j';
        char res = search(arr,target);
        System.out.println(res);
    }

    private static char search(char[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        char res='\u0000';
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]>target){
                    res=arr[mid];
                    end=mid-1;
            }
                else if(arr[mid]<=target){
                    start=mid+1;
            }
        }
        if(res=='\u0000'){
            return arr[0];
        }
        else{
            return res;
        }
    }
}