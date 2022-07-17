import java.util.*;

public class PalindromicSubstrings {

	public static void solution(String str){
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				palindrome(str.substring(i,j));
			}
		}
	}

	public static void palindrome(String s){
		int i=0, j=s.length()-1;
		boolean flag = true;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j)){
				flag=false;
			}
			i++;
			j--;
		}
		if(flag==true){
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
        scn.close();
	}

}