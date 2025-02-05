function solution(progresses, speeds) {
    var answer = [];
    
    const leftDays = progresses.map((progress, index)=> Math.ceil((100-progress)/speeds[index]));
    
    let count = 1;
    let maxDay = leftDays[0];
    
    for (let i =1; i<leftDays.length; i++){
        if(maxDay >= leftDays[i]){
            count ++;
        }else{
            answer.push(count);
            count = 1;
            maxDay = leftDays[i];
        }
    }
    
    answer.push(count);
        return answer;
}