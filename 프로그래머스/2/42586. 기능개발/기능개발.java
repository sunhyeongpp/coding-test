import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++){
            if((100-progresses[i])%speeds[i]==0){
                queue.offer((100-progresses[i])/speeds[i]);
            }else{
                queue.offer((100-progresses[i])/speeds[i]+1);
            }
        }
               
        int now = queue.poll();
        int count = 1;
               
               while(!queue.isEmpty()){
                   if(now >= queue.peek()){
                       count++;
                       queue.poll();
                   } else{
                       answer.add(count);
                       count = 1;
                       now = queue.poll();
                   }
               }
        answer.add(count);
               
               return answer.stream().mapToInt(i->i).toArray();
        
    }
}

/*
1. 각 작업이 완료되기까지 필요 나라 큐에 저장
2. 큐에서 값을 꺼내 기준 날짜로 삼음
3. 다른 작업들도 이 기준 날짜 안에 배포 가능한지 비교
4. 가능하면 함께 배포
5. 불가능하면 카운트 저장, 다음 작업부터 새롭게 시작
6. 마지막까지 처리 후 리스트를 배열로 변환

*/