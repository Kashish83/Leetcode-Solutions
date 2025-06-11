import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int n= temperatures.length;
        int result[]=new int[n];
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && temperatures[s.peek()]<=temperatures[i]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i]=0;
            }else{
                result[i]=s.peek()-i;
            }
            s.push(i);
        }

    return result;

    }
    
    public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int [] temperatures=new int[n];
  for(int i=0; i<n; i++){
 temperatures[i]=sc.nextInt();
  }
  Solution sol=new Solution();
  int result[]=sol.dailyTemperatures(temperatures);
  for(int i=0; i<result.length; i++ ){
    System.out.println(result[i]);
  }
    }
}
