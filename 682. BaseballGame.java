import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                st.push(2*st.peek());
            }else if(s.equals("+")){
                int a=st.pop();
                int b=a+st.peek();
                st.push(a);
                st.push(b);
            }else{
            
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
           
        } return sum;
    }
}
