import java.util.*;

public class ToggleCase {
    
	public static String toggleCase(String str){
		StringBuilder s = new StringBuilder(str); //if we use String, new String will be created each time.

		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch>='a'&&ch<='z'){ 
				char uc = (char)(ch - 'a' + 'A');
				s.setCharAt(i,uc);
			}
			else if(ch>='A'&&ch<='Z'){
				char lc = (char)(ch - 'A' + 'a');
				s.setCharAt(i,lc);
			}
		}
	return s.toString();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(toggleCase(str)); 
	}

}
