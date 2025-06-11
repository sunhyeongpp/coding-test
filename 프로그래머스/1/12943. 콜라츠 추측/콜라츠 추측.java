class Solution {
    public int solution(int num) {
        int answer = 0;
         long n = num;
        if(num==1) return 0;
        else{
          while(n != 1 && answer <= 500){
            if(n%2==0) {
                n = n/2;

                } else{
                n = 3*n+1;
    
            }
              answer++;
        }
        
        
        return  answer>500? -1: answer;  
        }
        
    }
}