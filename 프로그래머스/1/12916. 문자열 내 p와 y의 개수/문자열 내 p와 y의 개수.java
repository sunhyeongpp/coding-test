class Solution {
    boolean solution(String s) {
        
        String s1 = s.toLowerCase();
        
        int numP = 0;
        int numY = 0;
        for( char c : s1.toCharArray()){
            if( c== 'p') numP++;
            else if(c=='y') numY++;
        }
        
        boolean answer = numP == numY;

        return answer;
    }
}
