import java.util.*;

class Solution {
    public int solution(int[] nums) {
 
        
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for(int num: nums){
            numMap.put(num, numMap.getOrDefault(num, 0)+1);
        }
        
        int N = nums.length;
        
        if(N/2<=numMap.size()) return N/2;
        else return numMap.size();

    }
}