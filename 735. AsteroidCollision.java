import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        int n=asteroids.length;
       
        for(int i=0; i<n; i++){
            boolean destroyed=false;
            while(!st.isEmpty() && asteroids[i]<0 && st.peek()>0){
                if(st.peek()<-asteroids[i]){
                    st.pop();
                    continue;
                }else if(st.peek()== -asteroids[i]){
                    st.pop();
                    destroyed=true;
                    break;
                }else if(st.peek()> asteroids[i]){
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed){
                st.push(asteroids[i]);
            }
        }
         int result[]=new int [st.size()];
        for (int i = 0; i <st.size(); i++) {
            result[i] = st.get(i);
        }
        return result;
    }
    
}
