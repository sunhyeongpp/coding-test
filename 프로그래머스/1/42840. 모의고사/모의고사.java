import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] answers) {
        
        Map<Integer, int[]>patterns = Map.of(
       1, new int[] {1, 2, 3, 4, 5},
            2, new int[] {2, 1, 2, 3, 2, 4, 2, 5},
            3, new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
            );
        
        Map<Integer, Integer> scores = new HashMap<>();
        
        for(Map.Entry<Integer, int[]>entry : patterns.entrySet()){
            int id = entry.getKey();
            int[] pattern = entry.getValue();
            int score = 0;
            
            for(int i=0; i<answers.length; i++){
                if(answers[i]==pattern[i%pattern.length]){
                    score++;
                }
            }
            
            scores.put(id, score);
        }
        
        int max = Collections.max(scores.values());
        
        List<Integer> result = scores.entrySet().stream()
            .filter(e->e.getValue()==max)
            .map(Map.Entry::getKey)
            .sorted()
            .collect(Collectors.toList());
    
        
        return result.stream().mapToInt(i->i).toArray();
    }
}