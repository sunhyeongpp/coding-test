import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
      
        
        List<Integer> answerList = new ArrayList<>();
        
        Queue<Integer> que = new LinkedList<>();
        
        for(int i=0; i<speeds.length; i++){
            int lastTime = 100-progresses[i];
            if(lastTime%speeds[i]==0){
                que.add(lastTime/speeds[i]);
            }else{
                que.add(lastTime/speeds[i]+1);
            }
        }
        
        int cnt = 1;
        int prev = que.poll();
        while(!que.isEmpty()){
            int cur = que.poll();
            if(cur<=prev){
                cnt++;
            }else{
                answerList.add(cnt);
                cnt = 1;
                prev = cur;
            }
        }
        
        answerList.add(cnt);
        
        return answerList.stream().mapToInt(i->i).toArray();
    }
}