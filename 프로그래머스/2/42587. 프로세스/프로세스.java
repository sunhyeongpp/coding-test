import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
   
        
        //priorities큐
        Queue <int[]> que = new LinkedList<>();
        for(int i=0; i<priorities.length;i++){
            que.add(new int[]{i, priorities[i]});
        }
        
       
        int count = 0;
       while(!que.isEmpty()){
            int[] current = que.poll();
           boolean higher = false;
           
           for(int[] q: que){
               if(q[1]>current[1]){
                  higher = true;
                   break;
               }
           }
           
           if(higher){
               que.add(current);
           }else{
               count++;
               if(current[0]==location) return count;
           }
           
           
       }       
        
        
        return -1;
    }
}