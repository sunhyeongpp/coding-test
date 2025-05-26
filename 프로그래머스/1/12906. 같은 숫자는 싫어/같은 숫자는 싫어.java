import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> temp = new ArrayList<>();
        
       for(int a: arr){
           if(!temp.isEmpty()&& a==temp.get(temp.size()-1)) continue;
           temp.add(a);
       }
        int[] answer = temp.stream().mapToInt(i->i).toArray();

        return answer;
    }
}