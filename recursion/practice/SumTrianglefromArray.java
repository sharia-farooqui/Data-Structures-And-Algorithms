import java.util.Arrays;

public class SumTrianglefromArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void fun(int[] arr){
        if (arr.length == 1) {
            return;
        }
        int[] temp = new int[arr.length-1];
        helper(temp, arr, 0);
        fun(temp);
        System.out.println(Arrays.toString(temp));
    }
    private static int[] helper(int[] temp, int[] arr, int idx){
        if(idx==arr.length-1){
            return temp;
        }
        temp[idx]=arr[idx]+arr[idx+1];
        return helper(temp, arr, idx+1);
    }
}