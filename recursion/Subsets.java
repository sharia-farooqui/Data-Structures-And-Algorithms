import java.util.*;

public class Subsets {
    public static void printSubsequence(int[] arr, int idx, ArrayList<Integer>list){
        if(idx==arr.length){
            if(list.size()>0){
                System.out.println(list);
            }
            if(list.size()==0){
                System.out.println("[ ]");
            }
            return;
        }
        list.add(arr[idx]);
        printSubsequence(arr, idx+1, list); 
        list.remove(list.size()-1);
        printSubsequence(arr, idx+1, list);
    }
    
    public static void main(String[] args) {
    int[] arr= {3,1,2};
    ArrayList<Integer> list = new ArrayList<>();
    printSubsequence(arr, 0, list);
    }
    
}