
public class PermutationsCount {
    public static void main(String[] args) {
        int ans = permutations("","abc");
        System.out.println(ans);
    }
    public static int permutations(String pr, String str){
        if(str.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = str.charAt(0);

        for(int i=0;i<=pr.length();i++){
            String f = pr.substring(0, i);
            String s = pr.substring(i, pr.length());
            count = count + permutations(f + ch + s,(str.substring(1)));
        }

        return count;
    }
}

