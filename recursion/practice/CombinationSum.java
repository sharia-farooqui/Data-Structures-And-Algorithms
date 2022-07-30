import java.util.*;
public class CombinationSum
{
	public static void main(String[] args) {
		int[] arr = {2,3,6,7};
		int target = 7;
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		combinationSum(0, target, arr, new ArrayList<>(), res);
		System.out.println(res);
	}
	private static void combinationSum(int idx, int target, int[] arr, ArrayList<Integer> list, List<List<Integer>> res){
	    if(idx==arr.length){
	        if(target==0){
	            res.add(new ArrayList<>(list));
	        }
	        return;
	    }
	    if(arr[idx]<=target){
	        list.add(arr[idx]);
	        combinationSum(idx, target-arr[idx], arr, list, res); //pick
	        list.remove(list.size()-1);
	    }
	    combinationSum(idx+1, target, arr, list, res); //target > arr[idx], not pick
	}
}
