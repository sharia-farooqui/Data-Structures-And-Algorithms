
public class MissingNum {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        sort(arr);
        // System.out.println(Arrays.toString(arr));
        missing(arr);
    }
    private static void missing(int[] arr) {
        for(int x=0;x<arr.length;x++){
            if(x!=arr[x]-1){ //x not equal to element-1
                System.out.print(" "+(x+1));
            }
        }
    }
    private static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int element=arr[i];
            if(element<=arr.length&&element!=arr[element-1]){
                swap(arr,i,element-1);
            } 
            else{
                i++;
            }
        }
    }
    private static void swap(int[] arr,int i, int j) {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

}
