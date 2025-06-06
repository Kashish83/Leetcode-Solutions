import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice<prices[i]){
               int  profit=prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }else{
                buyPrice=prices[i];
            }
        }
         return maxProfit;
    }
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int prices[] = new int[n];
        for(int i=0; i<n; i++){
             prices[i]=sc.nextInt();
        }
        Solution sol= new Solution();
        System.out.println(sol.maxProfit(prices));
    }
}
