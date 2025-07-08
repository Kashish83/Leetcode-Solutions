import java.util.*;
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<s.length(); i++){
           char ch=s.charAt(i);
            if(ch=='('){
                st.push(0);
            }else{
                int count=0;
                while(st.peek()!=0){
                count+=st.pop();
                 }
            st.pop();
            if(count==0){
                st.push(1);
            }else{
                st.push(2*count);
            }
            }
            }
            int total=0;
            while(!st.isEmpty()){
                total+=st.pop();
            }
        
        return total;
            
    }
}
