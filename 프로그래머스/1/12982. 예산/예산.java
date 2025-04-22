import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d);
        int answer = 0;
        
        for (int a : d){
              if (budget>=a){
            budget -= a;
            answer++;
              } else break;
        }
        return answer;
    }
}

