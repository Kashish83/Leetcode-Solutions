import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     Stack<Integer>st=new Stack<>();
     Map<Integer,Integer> map=new HashMap<>();
    for(int num:nums2){
        while(!st.isEmpty() && st.peek()<num){
            map.put(st.pop(),num);//storing in map
        }
        st.push(num);//push current number
    }
    
    while(!st.isEmpty()){ // no greater then store -1
        map.put(st.pop(),-1);
    }
    int n=nums1.length;
    int result[]=new int[n];
    for(int i=0; i<n; i++){
        result[i]=map.get(nums1[i]);
    }
    return result;
    }
}
