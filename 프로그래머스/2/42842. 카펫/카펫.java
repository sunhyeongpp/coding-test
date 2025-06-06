import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] extent = new int[2];
        
        for(int yellow_w=yellow; yellow_w>=1; yellow_w--){        
            if(yellow%yellow_w==0){
                int yellow_h = yellow/yellow_w;
                int width = yellow_w + 2;
                int height = yellow_h + 2;

                if (width * height == brown + yellow && width >= height){
                    extent[0] = yellow_w+2;
                    extent[1] = yellow_h+2;
                    break;
                }
            }
        }        
        return extent;
    }
}