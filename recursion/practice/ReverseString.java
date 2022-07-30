import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverse(s, 0, s.length-1);
        System.out.println(Arrays.toString(s));
    }
    private static void reverse(char[] s, int i, int j){
        if(i==j){
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        reverse(s, i+1, j-1);
    }
}
