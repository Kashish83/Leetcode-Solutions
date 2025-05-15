import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public int maxArea(int[] height) {
        int maxWater=0;
        int lp=0; 
        int rp=height.length-1;
        while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int currWater=width*ht;
            maxWater=Math.max(currWater,maxWater);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    

    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int[]height = new int[n];
     for(int i=0; i<n; i++){
        height[i]=sc.nextInt();
     }
     Solution sol =  new Solution();
     int result = sol.maxArea(height);
     System.out.println(result);
    }
}
