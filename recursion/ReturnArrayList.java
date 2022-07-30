import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,8,3,2,3,6,4};
        int x = 3;
        ArrayList<Integer> ans = fun(arr, x, 0);
        System.out.println(ans);
    }   
    private static ArrayList<Integer> fun(int[] arr, int x, int idx){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx==arr.length){
            return list;
        }
        if(arr[idx]==x){
            list.add(idx);
        }
        ArrayList<Integer> ansbc = fun(arr, x, idx+1);
        list.addAll(ansbc);
        return list;
    }
}