import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] =sc.nextInt();
        }
        Solution sol = new Solution();
        int result= sol.majorityElement(nums);
        System.out.println(result);
        
    }
}
