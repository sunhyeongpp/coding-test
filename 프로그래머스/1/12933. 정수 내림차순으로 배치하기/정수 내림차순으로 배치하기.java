import java.util.*;

class Solution {
    public long solution(long n) {
        
        String[] strArr = String.valueOf(n).split("");
        
        List<String> list = Arrays.asList(strArr);
        
        Collections.sort(list, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s);
        }
         
        return Long.parseLong(sb.toString());
    }
}