import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int MaxW = 0;
        int MaxH = 0;
        
        for(int[]wallet: sizes){
            Arrays.sort(wallet);
           if (MaxW <= wallet[0]) MaxW = wallet[0];
            if(MaxH<=wallet[1]) MaxH = wallet[1];
        }
        
        answer = MaxW * MaxH;
        return answer;
    }
}

