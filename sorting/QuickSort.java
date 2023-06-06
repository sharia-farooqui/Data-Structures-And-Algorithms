public class QuickSort {
    private static int partition(int[] arr, int low, int high){
        int pivot=arr[low];
        int i=low, j=high;
        while(i<j){
            while(arr[i]<=pivot&&i<=high-1){
                i++;
            }
            while(arr[j]>pivot&& j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void quick_sort(int[] arr, int low, int high){
        if(low<high){
            int mid=partition(arr, low, high);
            quick_sort(arr, low, mid-1);
            quick_sort(arr, mid+1, high);
        }
    }
    public static void main(String[] args){
        int[] arr={4,6,2,5,7,9,1,3};
        quick_sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
