// pepCODinG -> p-11e11p-45C12O-11D37i5n-39G

import java.util.*;

public class AsciiDiff {

	public static String solution(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i=1;i<str.length();i++){
			sb.append(str.charAt(i)-str.charAt(i-1));
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}