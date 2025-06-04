import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        
        StringBuilder sb = new StringBuilder();
        
        String[] stringNums = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);
        
        Arrays.sort(stringNums, (a,b)->(b+a).compareTo(a+b));
        
        if(stringNums[0].equals("0")){
            return "0";
        }
        
        Arrays.stream(stringNums)
            .forEach(sb::append);
        
        return sb.toString();
        
    }
}