public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {9,8,10,8};
        int x = 8;
        System.out.println(first(arr, 0, x));
    }

    private static int first(int[] arr, int idx, int x) {
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        return first(arr, idx+1, x);
    }
    
}
