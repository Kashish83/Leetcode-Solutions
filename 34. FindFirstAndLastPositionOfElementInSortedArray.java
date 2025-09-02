class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result = {-1,-1};
        result[0]=findBound(nums,target,true);
        if (result[0] != -1){
            result[1]= findBound(nums,target,false);
        }
        return result;
        
    }
    private int findBound(int[] nums,int target,boolean isFirst){
        int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = left+ (right-left)/2;
            if(nums[mid]==target){
                if(isFirst){
                    if(mid == left || nums[mid-1] !=target){                    return mid;

                    }
                    right = mid-1;
                }else{
                    if(mid == right || nums[mid+1] != target){
                        return mid;
                    }
                    left= mid+1;
                }
            }else if(nums[mid]< target){
                left= mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}