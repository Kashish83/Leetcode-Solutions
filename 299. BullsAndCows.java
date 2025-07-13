import java.util.*;
class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0,cows=0;
        HashMap<Character,Integer> map1=new HashMap<>();      
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0; i<secret.length(); i++){
            char b=secret.charAt(i);
            char c=guess.charAt(i);
        if(b==c){
            bulls++;
        }else{
            map1.put(b,map1.getOrDefault(b,0)+1);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        }
        for(char ch:map2.keySet()){
            if(map1.containsKey(ch)){
                cows+=Math.min(map1.get(ch),map2.get(ch));
            }
        }
        return bulls+"A"+cows+"B";
    }
}
