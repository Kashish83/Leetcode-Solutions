import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token: tokens){
            if(token.equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(b+a);
           }else if(token.equals("-")){
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
           }else if(token.equals("*")){
                int a=st.pop();
                int b=st.pop();
                st.push(b*a);
           }else if(token.equals("/")){
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
           }else{
            st.push(Integer.parseInt(token));
           }
        }
        return st.pop();
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens=input.split(" ");
        Solution sol= new Solution();
        System.out.println(sol.evalRPN(tokens));
    }
}
