import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] xyz=new boolean[nums.length+1];
        for(int num:nums){
           xyz[num]=true;
        }
        for(int i=1; i<=nums.length; i++){
            if(!xyz[i]){
                list.add(i);
            }
        }
        return list;
    }
}
