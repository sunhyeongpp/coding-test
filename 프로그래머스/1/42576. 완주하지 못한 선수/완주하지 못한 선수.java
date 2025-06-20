import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
       Map<String, Integer> compleMap = new HashMap<>();
        
        for(String name: participant){
            compleMap.put(name, compleMap.getOrDefault(name,0)+1);
        }
        
        for(String compleName: completion){
            compleMap.put(compleName, compleMap.getOrDefault(compleName,0)-1);
        }
        
        for(String key: compleMap.keySet()){
            if(compleMap.get(key)==1) return key;
        }
        
        
        
        return "";
    }
}