public class SkipChar {
    public static void main(String[] args) {
        char ch = 'f';
        System.out.println(skip("fbacfghffvcad", ch));
    }
    private static String skip(String str, char ch){
        if(str.isEmpty()){
            return "";
        }
        if(str.charAt(0)==ch){
            return skip(str.substring(1), ch);
        }
        else{
            return str.charAt(0) + skip(str.substring(1), ch);
        }
    }
}
