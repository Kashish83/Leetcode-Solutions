import java.util.*;
class Solution {
    public int minAddToMakeValid(String s) {
        int add=0;
        int open=0;
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch=='('){
                open++;
            }else{
                if(open>0){
                    open--;
                }else{
                    add++;
                }
            }
        }
        return add+open;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        Solution sol= new Solution();
        System.out.println(sol.minAddToMakeValid(s));
    }
}