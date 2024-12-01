function solution(k, score) {
    const scoreArr = [];
    const answer = [];
    
    for(let i=0; i<score.length; i++){
        scoreArr.push(score[i]);
        scoreArr.sort((a,b)=>b-a);
        
        if(scoreArr.length>k){
            scoreArr.pop();
        }
        
        answer.push(scoreArr[scoreArr.length-1]);
    }   
    return answer;
}