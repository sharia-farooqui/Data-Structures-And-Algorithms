public class SkipString {
    public static void main(String[] args) {
        String str = "abcdapplefg";
        String x = "apple";
        System.out.println(skip(str,x));
    }
    private static String skip(String str, String x){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith(x)){
            return skip(str.substring(5), x); //returns from 5 till end
        }
        else{
            return str.charAt(0) + skip(str.substring(1), x);            
        }
    }

}
