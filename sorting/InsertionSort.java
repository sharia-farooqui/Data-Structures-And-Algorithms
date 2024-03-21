import java.util.*;
public class InsertionSort
{
	public static void main(String[] args) {
		int[] arr =  {2,9,5,1,3};
		for(int i=0;i<arr.length;i++){
	        int j=i;
	        while(j>0&&arr[j-1]>arr[j]){
	            int temp=arr[j-1];
	            arr[j-1]=arr[j];
	            arr[j]=temp;
	            j--;
	        }
	   	}
		System.out.println(Arrays.toString(arr));
	}
}
