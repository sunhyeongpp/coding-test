class Solution {
    public int solution(int n) {
        
        String str = String.valueOf(n);
        
        int answer = 0;
        for (char s : str.toCharArray()){
            answer += s-'0';
        }
        
        return answer;
    }
}
