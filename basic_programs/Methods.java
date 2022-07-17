public class Methods {
    public static void main(String[] args) {
        greet();
        float returned= (float) twoInts(); //type casted int to float
        System.out.println("Returned val is : " + returned);
        String a = rstring();
        System.out.println("Returned string is : " + a);

    }
    static void greet(){
        System.out.println("Hey there!");
    }

    static int twoInts(){
        return 30+10;
    }

    static String rstring(){
        return "Returning a string.";
        // System.out.println("Plah Plah PLah"); -> UNREACHABLE CODE
    }
}