import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int duplicate=0;
        int result[]=new int[2];
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]){
                duplicate=nums[i];
               result[0]=nums[i];
               break;
            }
            

        }
        int actual=n*(n+1)/2;
        int curr=0;
        for(int i=0; i<n; i++){
            curr+=nums[i];

        } 
        int ans=actual-(curr-duplicate);
        result[1]=ans;
        return result;
    }
}
