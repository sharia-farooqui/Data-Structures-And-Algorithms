public class StairPath{
    public static void main(String[] args) {
        int n=3;
        int cnt = countPath(n);
        System.out.println("Number of paths : " + cnt);
        getPath(n, "");
    }

    private static int countPath(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int l = countPath(n-1);
        int r = countPath(n-2);
        return l+r;
    }

    private static void getPath(int n, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(n<0){
            return;
        }
        getPath(n-1, str+'1');
        getPath(n-2, str+'2');
    }
}