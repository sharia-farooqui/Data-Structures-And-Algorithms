import java.util.*;
public class PermutationsInt{
    public static void main(String[] args) {
    int[] nums = {1,2,3};
	List<List<Integer>> list = new ArrayList<>();
	list = permute(nums);
	System.out.println(list);
}

public static List<List<Integer>> permute(int[] nums){
	List<List<Integer>> ans = new ArrayList<>();
	getPerm(ans, nums, 0);
	return ans;
}

public static void getPerm(List<List<Integer>> ans, int[] nums, int idx){
	if(idx==nums.length) {
		List<Integer> ds = new ArrayList <>();
		for(int i=0; i<nums.length; i++) {
			ds.add(nums[i]);
		}
		ans.add(new ArrayList <>(ds));
		return;
	}
	for (int i = idx; i<nums.length; i++) {
		swap(i, idx, nums);
		getPerm(ans, nums, idx+1);
		swap(i, idx, nums);
	}
}
public static void swap(int i, int j, int[] nums) {
	int t = nums[i];
	nums[i] = nums[j];
	nums[j] = t;
}
}