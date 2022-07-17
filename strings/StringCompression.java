import java.util.*;

public class StringCompression {

	public static String compression1(String str){
		String s = "";
		s = s + str.charAt(0);
		for(int i=1, j=i-1;i<str.length();i++){
			if(str.charAt(i)!=str.charAt(j)){
				s+=str.charAt(i);
			}
			j++;
		}
		return s;
	}

	public static String compression2(String str){
		String s = "";
		s = s + str.charAt(0);
		int cnt = 1;
		for(int i=1, j=i-1;i<str.length();i++){
			if(str.charAt(i)==str.charAt(j)){
				cnt++;
			}
			else if(str.charAt(i)!=str.charAt(j)){
				if(cnt>1){
					s+=cnt;
				}
				cnt=1;
				s+=str.charAt(i);
			}
			j++;
		}
		if(cnt>1){
			s+=cnt;
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}