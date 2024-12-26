function solution(food) {
    var answer = '';
    let halfarr = [];
    
    for (i = 1; i<food.length; i++) {
        for(k=1; k <= Math.floor(food[i]/2); k++){
            halfarr.push(i);
        }
    }
    
    answer = halfarr.join("").concat("0",halfarr.reverse().join(""));
    return answer;
}
