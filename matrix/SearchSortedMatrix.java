public class SearchSortedMatrix {
    public static void main(String[] args) {
        int[][] arr={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int r=3,c=4;
        int target=16;
        int[] ans = search(arr,target,r,c);
        for(int i=0;i<ans.length;i++){
            System.out.print(" " + ans[i]);
        }
    }
    private static int[] search(int[][] arr, int target,int r, int c){
        int i=0;
        int j = arr.length-1;

        int[] def = {-1,-1};
        int[] res = new int[2];
        
        while(i>=0&&i<r&&j>=0&&j<c){
            if(arr[i][j]==target){
                res[0]=i;
                res[1]=j;
                return res;
            }
            else if(arr[i][j]>target){
                j--;
            }
            else if(arr[i][j]<target){
                i++;
            }
        }
        return def;
    }
}
