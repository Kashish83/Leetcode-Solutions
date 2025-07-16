import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq= new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
         int n=nums.length;
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            if(entry.getValue()>n/3){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
