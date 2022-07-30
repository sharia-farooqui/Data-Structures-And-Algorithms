import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        ArrayList<String> ans = permutations("","abc");
        System.out.println(ans);
    }
    public static ArrayList<String> permutations(String pr, String str){
        
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pr);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i=0;i<=pr.length();i++){
            String f = pr.substring(0, i);
            String s = pr.substring(i, pr.length());
            ans.addAll(permutations(f + ch + s,(str.substring(1))));
        }

        return ans;
    }
}
