import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        
        Arrays.sort(mats);
        for(int i=mats.length-1; i>=0; i--){
            int size = mats[i];
            if(canPlace(size, park)) return size;
        }
        return -1;
    }
    
    boolean canPlace(int size, String[][] park){
        int rows = park.length;
        int cols = park[0].length;
        
        for(int i=0; i<=rows-size; i++){
            for(int j=0; j<=cols-size; j++){
                if(isAllEmpty(i, j, size, park)) return true;
            }
        }
        return false;
    }
    
    boolean isAllEmpty(int x, int y, int size, String[][] park)
    {
        for(int i=x; i<x+size; i++){
            for(int j=y; j<y+size; j++){
                if(!park[i][j].equals("-1") )return false;
            }
        }
        return true;
    }
}

