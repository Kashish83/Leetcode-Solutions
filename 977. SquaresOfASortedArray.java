class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] result= new int[n];
        int left=0; 
        int right=n-1;
        int index=n-1;
        while(left<=right){
            int leftsub=nums[left]*nums[left];
            int rightsub=nums[right]*nums[right];
            if(leftsub>rightsub){
            result[index--]=leftsub;
            left++;
            }else{
                result[index--]=rightsub;
                right--;
            }
        }
        return result;
    }
}