import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        
        PriorityQueue <Integer>pq = new PriorityQueue<>();
        
        for (int s : scoville) {
        pq.offer(s);
    }

        
        while(pq.size() >= 2 && pq.peek()<K){
            int first = pq.poll();
            int second = pq.poll();
            int rowest = first+(second*2);
            pq.offer(rowest);
            count++;
        }
        
         if (pq.peek() < K) return -1;
        
        
        return count;
    }
}

//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
