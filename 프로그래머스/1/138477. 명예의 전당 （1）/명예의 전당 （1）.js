function solution(k, score) {
    const scoreArr = []; // 명예의 전당 점수 배열
    const answer = [];
    
    for(let i=0; i<score.length; i++){
        scoreArr.push(score[i]); 
        scoreArr.sort((a,b)=>b-a); // 내림차순 정렬
        
        if(scoreArr.length>k){ // 출연자가 k명이 넘을 때매다 탈락자를 pop 시킴
            scoreArr.pop();
        }
        
        answer.push(scoreArr[scoreArr.length-1]); // 명예의전당 중 최하위를 push
    }   
    return answer;
}