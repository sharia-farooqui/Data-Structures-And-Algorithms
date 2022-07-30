public class MaxOfArray {

    public static void main(String[] args) throws Exception {
        int[] arr = {30,10,50,20,19};
        System.out.println(maxOfArray(arr, 0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int msa = maxOfArray(arr, idx+1);
        if(msa>arr[idx]){
            return msa;
        }
        return arr[idx];
    }

}