function solution(r1, r2) {
    var answer = 0;
    
    //1사분면 두 원 사이 점 갯수
    for (let x=1; x<=r2; x++){
        const maxY_r2 = Math.floor(Math.sqrt(r2**2-x**2));
        const maxY_r1 = x<r1 ? Math.ceil(Math.sqrt(r1**2-x**2)-1) : 0;
        
        answer += maxY_r2 - maxY_r1;
    }
    
    //x=0일 때 
    for(let y=1; y<=r2; y++){
        if(y>=r1){
            answer++;
        }
    }
    
  answer = answer *4;  
    
    return answer;
}


//1. 반지름이 각각 r1, r2인 원 내부 (x,y) 좌표가 정수인 점의 갯수를 구한다. 
//2. r2 내부 정수 좌표 갯수 - r1 내부 정수 좌표 갯수를 반환한다. 
//3. 1사분면을 기준으로 구하고 4를 곱한다. (이때 경계 좌표 겹치지 않게 유의해야 함)

