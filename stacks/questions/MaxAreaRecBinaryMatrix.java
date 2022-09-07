import java.util.*;

public class MaxAreaRecBinaryMatrix {
    public static void main(String[] args) {

        char[][] matrix={
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols]; //to store each histogram, 1D array.
           
        for(int j=0; j<cols; j++){
            heights[j]=Character.getNumericValue(matrix[0][j]);
        }
        
        int max = mah(heights,cols);
        
        for(int i=1; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]=='0'){
                    heights[j]=0;
                }
                else{
                    heights[j]= heights[j]+1;
                }
            }
           max = Math.max(max, mah(heights, cols));
        }
        
        System.out.println(max);

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
