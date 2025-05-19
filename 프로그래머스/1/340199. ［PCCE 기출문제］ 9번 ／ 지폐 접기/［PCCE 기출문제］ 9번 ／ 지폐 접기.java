class Solution {
    public int solution(int[] wallet, int[] bill) {
      return Math.min(getFoldCount(bill[0], bill[1], wallet[0], wallet[1]),
                        getFoldCount(bill[1], bill[0], wallet[0], wallet[1]));
    }
    
    private int getFoldCount(int bill1, int bill2, int wallet1, int wallet2){
        int folds = 0;
        
        while(bill1 > wallet1 || bill2 > wallet2){
            if(bill1 >=bill2){
                bill1 = bill1/2;
            } else{
                bill2 = bill2/2;
            }
            folds++;
        }
        return folds;
    }
}