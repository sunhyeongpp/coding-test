import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        List<Integer> temp = new ArrayList<>();
        int numLen = numbers.length;
        for (int i=0; i<numLen; i++){
            for(int j=numLen-1; j>i; j--){
                    temp.add(numbers[i]+numbers[j]);   
            }
        }        
        answer = temp.stream().distinct().sorted().mapToInt(a->a).toArray();
        
        return answer;
    }
}