import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch: s.toCharArray()){
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder result=new StringBuilder();
        for(char c:st){
            result.append(c);
        }
        return result.toString();
    }
}
