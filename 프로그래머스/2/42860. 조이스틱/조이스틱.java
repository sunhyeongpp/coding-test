import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int move = name.length()-1;
        for(char c: name.toCharArray()){
            int upDown = Math.min(c-'A', 'Z'-c+1);
            answer+=upDown; 
        }
        
        for (int i = 0; i < name.length(); i++) {
    int next = i + 1;
    while (next < name.length() && name.charAt(next) == 'A') {
        next++;
    }
    move = Math.min(move, i + i + name.length() - next);
    move = Math.min(move, (name.length() - next) * 2 + i); 
}
        
        
        return answer+move;
    }
}