import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubble_sort(arr);
    }

    private static void bubble_sort(int[] arr){
        
        for(int i=0;i<arr.length;i++){ //passes
            boolean swap = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swap = true;
                }
            } //comparisions
            if(swap==false)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int a, int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }

}