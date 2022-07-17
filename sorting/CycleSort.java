import java.util.Arrays;

public class CycleSort{
    public static void main(String[] args) {
        int[] arr={8,7,5,3,9,1,4,2,6};
        cycle_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    private static void cycle_sort(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(i!=arr[i]-1){
            swap(arr, i,arr[i]-1); //i-> current idx, arr[i]-1 -> correct idx
        }
        else{
            i++;
        }
        }
    }

    private static void swap(int[] arr, int a, int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
}