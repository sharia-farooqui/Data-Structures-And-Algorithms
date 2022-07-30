public class CountMazePaths {
    public static void main(String[] args) {
        int res = paths(3,3);
        System.out.println(res);
    }
    private static int paths(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = paths(r-1, c);
        int right = paths(r, c-1);

        return left+right;
    }
}
