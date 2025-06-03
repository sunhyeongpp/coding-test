import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;      
        
        int time = 0;
        
        int returnTime = 0;
        //요청시간 오름차순 정렬
        PriorityQueue<int[]> pqR = new PriorityQueue<>((a,b)->a[0]-b[0]);
        //작업소요시간 오름차순 정렬
        PriorityQueue<int[]> pqTime = new PriorityQueue<>((a,b)->a[1]-b[1]);
        
        for( int[] job : jobs){
            pqR.offer(job);
        }
       
        //요청시간 정렬 -> time과 pqR.peek()가 작거나 같으면 pqTime에 추가 
        //현재 작업 끝나면 pqTime.poll()
        //현재 작업이 끝나는 시간은 pqTime.peek()[1]을 더해서 판단 
        // 현재 작업 끝나는 시간 - pqTime.peek()[0] => 각각.. 
        
        while (!pqR.isEmpty() || !pqTime.isEmpty()){
             while (!pqR.isEmpty() && pqR.peek()[0] <= time) {
                pqTime.offer(pqR.poll());
            }
        
                if(!pqTime.isEmpty()){
                    int[] now = pqTime.poll();
                    time+=now[1];
                    returnTime += time-now[0];
                } else{
                    time++;
                }
            
        }
        
        answer = returnTime / jobs.length;
        
        
    
        
        return answer;
    }
}

//소요시간 짧은 순 -> 요청 시각 빠른 순 -> 작업 번호 작은 순
//한번에 한 작업만
//반환시간 = 작업종료시간 - 요청시각
// 반환시간의 평균의 정수 부분 return 

//대기 큐.. 우선순위 큐... 

// time이 되면 대기 큐에 넣고 그 대기큐를 우선순위큐로 정렬

