import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int [] result=new int [n];
        for(int i=0; i<n; i++){
            result[i]=-1;
        }
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1; i>=0; i--){
            int index=i%n;
            while(!st.isEmpty()&& nums[st.peek()]<=nums[index]){
                st.pop();

            }
            if(!st.isEmpty()){
                result[index]=nums[st.peek()];
            }
            st.push(index);
        }
        return result;
    }
}
