import java.util.*;

public class MergeSort {
    public static void merge(int[] arr, int low, int high, int mid){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;  
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[high]);
            right++;
        }
        for(int i=low; i<=high; i++){
            arr[i]=temp.get(i-low);
        }
    }
    public static void merge_sort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        merge(arr, low, high, mid);
    }
    public static void main(String[] args){
        int[] arr={9,4,7,6,3,1,5};
        merge_sort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}