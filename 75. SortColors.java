class Solution {
    private void swap(int nums[],int i,int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int mid=0,high=n-1,low=0;
        while(mid<=high){
            if(nums[mid]==0){
            swap(nums,low,mid);
            mid++;
            low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,high,mid);
                    high--;
                
            }
        }
    }
}
