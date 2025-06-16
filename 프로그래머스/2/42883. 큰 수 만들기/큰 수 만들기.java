import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        
        char[] array = number.toCharArray();
        StringBuilder answerSb = new StringBuilder();
        
        
        int len = array.length -k;
        int start = 0;
        
        for(int i=0; i<len; i++){
            char max = '0';
            
            for(int j=start; j<=i+k;j++){
                if(array[j]>max){
                    max = array[j];
                    start = j+1;
                }
            }
            answerSb.append(Character.toString(max));
            
        }
        
        answer = answerSb.toString();
        
        return answer;
    }
}
