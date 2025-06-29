import java.util.*;
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null||matrix.length==0) return 0;
        int maxArea=0;
        int cols=matrix[0].length;
        int [] heights=new int[cols];
        for(char[]row: matrix){
            for(int i=0; i<cols; i++){
                if(row[i]=='1'){
                    heights[i]+=1;
                }else{
                    heights[i]=0;
                }
            }
            maxArea=Math.max(maxArea,largestRectangleArea(heights));
        }
        return maxArea;
    }


    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        int nsr[]=new int[n];
        int nsl[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }if(s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
         for(int i=0; i<n; i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0; i<n; i++){
            int height=heights[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(currArea,maxArea);
        }
        return maxArea;
    }
    
}
