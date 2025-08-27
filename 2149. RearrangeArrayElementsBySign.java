import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
         ArrayList<Integer> neg=new ArrayList<>();
         for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
         }
         int result[]=new int[nums.length];
         int index=0;
         for (int i = 0; i < pos.size(); i++) {
            result[index++] = pos.get(i); // place positive
            result[index++] = neg.get(i); // place negative
        }

         return result;
    }
}
