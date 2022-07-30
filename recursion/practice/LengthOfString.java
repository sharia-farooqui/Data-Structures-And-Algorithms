public class LengthOfString
{
	public static void main(String[] args) {
	    int ans  = len("lgtjrdfkngtbrkdfl");
	    System.out.println(ans);
	}
	private static int len(String str){
	    if(str.length()==1){
	        return 1;
	    }
	    // int res = len(str.substring(1));
	    // res = res+1;

        return len(str.substring(1)) + 1;
        
	    //return res;
	}
}

