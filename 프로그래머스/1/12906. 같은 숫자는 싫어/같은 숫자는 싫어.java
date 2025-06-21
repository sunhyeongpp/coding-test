import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        List <Integer> arrList = new ArrayList<>();
        arrList.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
               arrList.add(arr[i]);
            }
        }

        //이 부분 체크
        return arrList.stream().mapToInt(i->i).toArray();
    }
}