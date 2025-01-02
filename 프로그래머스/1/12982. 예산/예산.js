function solution(d, budget) {
    var answer = 0;
    const dSort=d.sort((a,b)=>a-b);
    let sum=0;
    for(let i=0; i<d.length; i++){
        sum += dSort[i];
        if(sum>budget){
            return answer;
        }
        answer++;
    }
    return answer;
}


