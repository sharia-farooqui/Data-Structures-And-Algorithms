import java.util.*;

//PARAMETERISED
// public class Reverse
// {
// 	public static void main(String[] args) {
// 		int[] arr = {1,3,2,5,4};
// 		reverse(arr, 0, arr.length-1);
// 		for(int i=0;i<arr.length;i++){
// 		    System.out.println(arr[i]);
// 		}
// 	}
// 	public static void reverse(int[] arr, int i, int j){
// 	    if(i>=j){
// 	        return;
// 	    }
// 	    int temp=arr[i];
// 	    arr[i]=arr[j];
// 	    arr[j]=temp;
// 	    reverse(arr, i+1, j-1);
// 	}
// }

//FUNCTIONAL
// public class Reverse
// {
// 	public static void main(String[] args) {
// 		int[] arr = {1,2,3,4,6,8,42,4,2};
// 		reverse(arr,0);
// 		System.out.println(Arrays.toString(arr));
// 	}
// 	private static void reverse(int[] arr, int i){
// 	    int n = arr.length;
// 	    if(i>=n/2){
// 	        return;
// 	    }
// 	    int temp=arr[i];
// 	    arr[i]=arr[n-i-1];
// 	    arr[n-i-1]=temp;
// 	    reverse(arr, i+1);
// 	}
// }
