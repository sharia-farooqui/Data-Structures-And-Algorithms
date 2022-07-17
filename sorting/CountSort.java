import java.util.Arrays;

public class CountSort
{
	public static void main(String[] args) {
		int[] nums={4,2,2,8,3,3,1};
		int max = getMax(nums);
		
		//frequency array
		int[] auxArr = new int[max+1];
		for(int i=0;i<nums.length;i++){
		    auxArr[nums[i]] +=1; 
		}
		
		//cumulative sum to maintain stable sort
		for(int i=1;i<auxArr.length;i++){
		    auxArr[i]=auxArr[i]+auxArr[i-1];
		}
		
		int[] result = new int[nums.length];
		for(int i=0;i<nums.length;i++){
		    int val=nums[i];
		    int idx = auxArr[val]-1;
		    result[idx]=val;
		    auxArr[val]--; //for duplicates
		}
		
		System.out.println(Arrays.toString(result));
	}

	private static int getMax(int[] nums){
	    int max=nums[0];
	    for(int i=0;i<nums.length;i++){
	        if(nums[i]>max)
	            max=nums[i];
	    }
	    return max;
	}
}
