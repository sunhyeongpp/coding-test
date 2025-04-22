class Solution {
    public int[] solution(long n) {
        
        String str = String.valueOf(n);
        String sb = new StringBuilder(str).reverse().toString();
      
        int[] answer = new int[sb.length()];
        
        for(int i=0; i<sb.length(); i++){
            answer[i] = sb.charAt(i)-'0';
        }
           
        return answer;
    }
}