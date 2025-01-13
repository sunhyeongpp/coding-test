function solution(price, money, count) {
    var answer = 0;

    let countPrice = 0;
    for(let i=1; i<=count; i++){
    countPrice += i * price;  
    } 
    if(money >= countPrice){
        answer = 0;
    } else{
        answer = countPrice-money;
    }
    return answer;
}