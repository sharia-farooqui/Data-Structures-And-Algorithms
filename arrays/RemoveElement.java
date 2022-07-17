public class RemoveElement{
    public static void main(String[] args) {
    int[] nums={1};
    int val=1;
    int element = removeElement(nums,val);
    for(int i=0;i<element;i++){
        System.out.println(nums[i]);
    } //this loop wont run in this test case
    }
    private static int removeElement(int[] nums, int val){
            int p=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[p]=nums[i];
                    p+=1;
            }
        }
            return p;
    }
}