import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        //for(int[]command: commands) 순회
        // array.split(command[0], command[1]+1)[command[2]-1];
        // 이걸 answer 배열에 담으려면, 리스트로 담고 배열로 변환해야 함

        for(int i = 0; i < commands.length; i++) {
             int[] command = commands[i];
            int[] sliced = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(sliced);
            answer[i] = sliced[command[2]-1];
        }
        
        return answer;
    }
}