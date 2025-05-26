import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
       List<int[]> answerList = new ArrayList<>();
        
         Map<String, Integer> colIndex = Map.of(
            "code", 0,
            "date", 1,
            "maximum", 2,
            "remain", 3
        );
        
       int extIdx = colIndex.get(ext);
        
        for (int[] d : data) {
            if (d[extIdx] < val_ext) {
                answerList.add(d);
            }
        }
        
       int sortIdx = colIndex.get(sort_by);
        answerList.sort(Comparator.comparingInt(a -> a[sortIdx]));
        
       return answerList.toArray(new int[answerList.size()][]);
    }
}

