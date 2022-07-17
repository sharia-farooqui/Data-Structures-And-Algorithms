import java.util.*;
public class Palindrome
{
	public static void main(String[] args) {
		String str = "MADAlM";
		boolean result = palindrome(str,0);
		System.out.println(result);
	}
	private static boolean palindrome(String str, int i){
	    if(i>=str.length()/2){
	        return true;
	    }
	    if(str.charAt(i)!=str.charAt(str.length()-i-1)){
	        return false;
	    }
	    return palindrome(str, i+1);
	}
}
