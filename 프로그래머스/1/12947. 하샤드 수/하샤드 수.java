class Solution {
    public boolean solution(int x) {
        
        String strX = Integer.toString(x); 
        
        int sum = 0;
        for(char c: strX.toCharArray()){
            sum += Integer.parseInt(String.valueOf(c));
        }
        
        return x%sum ==0;
    }
}