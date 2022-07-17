import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={64, 34, 25, 12, 22, 11, 90};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    private static void sort(int[] arr) {
        for(int x=0;x<arr.length;x++){ //passes
            int maxIndex = max(arr,x);
            swap(arr, arr.length-x-1,maxIndex);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }

    private static int max(int[] arr,int x) {
        int max=arr[0];
        int pos=0;
        for(int i=1;i<arr.length-x;i++){
            if(arr[i]>max){
                max=arr[i];
                pos=i;
            }
        }
        return pos;
    }
}