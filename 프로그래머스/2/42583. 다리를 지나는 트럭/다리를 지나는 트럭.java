import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        int sum = 0;
        int time = 0;
        
        for(int i=0; i<truck_weights.length; i++){
            int truck = truck_weights[i];
            
            while(true){
                if(queue.isEmpty()){
                    queue.add(truck);
                    sum+=truck;
                    time++;
                    
                    break;
                } else if(queue.size()==bridge_length){
                    sum-=queue.poll();
                } else{
                    if(sum+truck<=weight){
                        queue.add(truck);
                        sum+=truck;
                        time++;
                        break;
                    }else{
                        queue.add(0);
                        time++;
                    }
                }
            }
        }
        
        
        
        return time+bridge_length;
    }
}

/*

1. 1대 당 최소 bridge_length 초 걸림
2. 큐에 쌓인 값의 합이 weight보다 클 수 없음
3. truck_weights 순서대로 큐에 쌓임

=> 트럭 : 현재 들어가있는 시간 쌍으로 큐를 만들어야..? 
(들어간 시점을 쌍으로 하고.. 현재 시간에서 빼서 계산..?)
*/