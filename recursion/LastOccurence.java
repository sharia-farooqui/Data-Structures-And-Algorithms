public class LastOccurence {

    public static void main(String[] args) throws Exception {
        int[] arr = {10,8,7,8,4,50};
        int ans = lastIndex(arr, 0, 8);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int last = lastIndex(arr, idx+1, x);
        if(last == -1){
            if(arr[idx]==x){
                return idx;
            }
            else{
                return -1;
            }
        }
        else{
            return last;
        }
    }
}
