
public class FirstUpperCase
{
	public static void main(String[] args) {
		String str = "geeKSs";
		System.out.println(fun(str,0));
	}
	private static char fun(String str, int idx){
	    if(idx==str.length()-1){
	        return 0;
	    }
	    if(Character.isUpperCase(str.charAt(idx))){
	        return str.charAt(idx);
	    }
	    else{
	        return fun(str, idx+1);
	    }
	}
}
