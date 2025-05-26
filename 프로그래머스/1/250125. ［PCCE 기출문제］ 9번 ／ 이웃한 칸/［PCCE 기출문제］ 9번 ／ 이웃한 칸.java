class Solution {
    public int solution(String[][] board, int h, int w) {
        
       int[] dx = {-1, 1, 0, 0};
        int[] dy = {0,0,-1,1};
        
         int n = board.length;        
        int m = board[0].length; 
        
        int count = 0;
        for(int i=0; i<4; i++){
            int nx = h+dx[i];
            int ny = w+dy[i];
            
        if(nx>=0&&nx<n && ny>=0 && ny<m){
               if(board[nx][ny].equals(board[h][w])) count++;
            }
        }
        
        return count;
    }
}

