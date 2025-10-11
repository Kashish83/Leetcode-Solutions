class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        int max=sum;
        int startIndex=0;
        int endIndex=k;
            while(endIndex<n){
                sum-=nums[startIndex];
                startIndex++;
                sum+=nums[endIndex];
                endIndex++;
                max=Math.max(max,sum);
            }
        
        return (double)max/k;
    }
}
