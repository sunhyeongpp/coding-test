import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> temp = new ArrayList<>();
        
        for (int a: arr){
            if(a%divisor==0) temp.add(a);
        }
        if(temp.size()==0) temp.add(-1); 
        
        int[] answer = temp.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}