import java.util.*;
class Solution {
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
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int heights[]=new int[n];
        for(int i=0; i<n; i++){
            heights[i]=sc.nextInt();
        }
    Solution sol=new Solution();
    int result=sol. largestRectangleArea(heights);
    System.out.println(result);
    } 
}
