import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Set<String> phoneSet = new HashSet<>();
        
        for(String num: phone_book){
            phoneSet.add(num);
        }
        
        for(String num: phoneSet){
            for(int i=1; i<num.length(); i++){
                if(phoneSet.contains(num.substring(0,i))) return false;
            }
        }
        
        return answer;
    }
}