import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement= target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[]nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Solution sol = new Solution();
        int[]result=sol.twoSum(nums,target);
        if (result[0]!=-1){
            System.out.println(result[0]+result[1]);

        }else{
            System.out.println("-1");
        }
    }
}