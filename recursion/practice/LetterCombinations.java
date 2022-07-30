import java.util.ArrayList;

public class LetterCombinations {
    public static void main(String[] args) {
        ArrayList<String> ans = letterCombinations("23");
        System.out.println(ans);
    }
    static String[] codes = {"_","_","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; //global array
    private static ArrayList<String> letterCombinations(String str){
        if(str.length()==0){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        char ch = str.charAt(0);
        ArrayList<String> comb = letterCombinations(str.substring(1));
        ArrayList<String> allComb = new ArrayList<>();

        String codeforch = codes[ch-'0']; //char to int
        for(int i=0;i<codeforch.length();i++){
            char c = codeforch.charAt(i);
            for(String s:comb){
                allComb.add(c+s);
            }
        }
        return allComb;
    }
}
