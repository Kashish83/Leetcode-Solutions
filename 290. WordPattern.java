import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char ps=pattern.charAt(i);
            String cs = words[i];
            if(map1.containsKey(ps)){
                if(!map1.get(ps).equals(cs)){
                    return false;
                }
            }else{
                map1.put(ps,cs);
            }
            if(map2.containsKey(cs)){
                if(map2.get(cs)!=ps){
                    return false;
                }
            }else{
                map2.put(cs,ps);
            }
        }
        return true;
    }
}
