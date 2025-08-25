import java.util.*;
class Solution {
    public String frequencySort(String s) {
        //freq store
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        //converting in list and descending order
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());

// adding in new string for result
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:list){ // take chacter like 'e'
            for(int i=0; i<entry.getValue(); i++){ //rechecking and setting according to freq
                sb.append(entry.getKey()); // entry.getKey means adding 'e' not entry.getValue it will store freq
            }
        }
        return sb.toString();
     }
}
