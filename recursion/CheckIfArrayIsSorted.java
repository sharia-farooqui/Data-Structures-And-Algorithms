
public class CheckIfArrayIsSorted
{
	public static void main(String[] args) {
	    int arr[] = {1,3,5,6,12};
	    System.out.println(check(arr, 0));
	}
	private static boolean check(int[] arr, int idx){
	    
	    if(idx==arr.length-1){
	        return true;
	    }
	    
	    if(arr[idx]<arr[idx+1]){
	        return check(arr, idx+1);
	    }
	    
	    return false;
	    
	}
}
