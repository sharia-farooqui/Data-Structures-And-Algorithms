public class PalindromeString
{
	public static void main(String[] args) {
	    String str="xyz";
		boolean ans = palindrome(str);
		System.out.println(ans);
	}
	private static boolean palindrome(String str){
	    int i=0;
		int j=str.length()-1;
		while(i<j){
		    if(str.charAt(i)!=str.charAt(j)){
		        return false;
		    }
		i++;
		j--;
		    
		}
		return true;
	}
}
