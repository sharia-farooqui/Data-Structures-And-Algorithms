public class MazeAllPaths{
    public static void main(String[] args) {
        boolean[][] arr = {
            {true, true, true},
            {true, true, true},
            {false, true, true}
        };
        allPaths("", arr, 0, 0);
    }
    private static void allPaths(String str, boolean[][] arr, int r, int c){
        if(r==arr.length-1&&c==arr[0].length-1){
            System.out.println(str);
            return;
        }
        
        if(arr[r][c]==false){
            return; //already false
        }

        arr[r][c]=false; //visited

        if(r<arr.length-1){
            allPaths(str+'D', arr, r+1, c);
        }
        if(c<arr[0].length-1){
            allPaths(str+'R', arr, r, c+1);
        }
        if(r>0){
            allPaths(str+'U', arr, r-1, c);
        }
        if(c>0){
            allPaths(str+'L', arr, r, c-1);
        }

        arr[r][c]=true; //restore changes

    }
}