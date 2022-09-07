import java.util.Stack;

public class MAH{
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int ans = mah(heights, heights.length);
        System.out.println(ans);
    }
    public static int mah(int[] heights, int size){
        int[] left = nsl(heights, size);
        int[] right = nsr(heights, size);

        int[] width = new int[heights.length];
        int maxArea=0;
        for(int i=0;i<width.length;i++){
            width[i]=right[i]-left[i]-1;
            int area=width[i]*heights[i];
            if(area>maxArea){
                maxArea=area;
            }
        }
        return maxArea;
    }

    public static int[] nsl(int[] heights, int size){
        int[] res = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        res[0]=-1;
        st.push(0);
        for(int i=1;i<heights.length;i++){
            while(st.size()>0&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(i);
        }
        return res;
    }

    public static int[] nsr(int[] heights, int size){
        int[] res=new int[heights.length];
        Stack<Integer> st = new Stack<>();
        res[heights.length-1]=heights.length;
        st.push(heights.length-1);
        for(int i=heights.length-2;i>=0;i--){
            while(st.size()>0&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=heights.length;
            }
            else{
                res[i]=st.peek();
            }
            st.push(i);
        }
        return res;
    }

}