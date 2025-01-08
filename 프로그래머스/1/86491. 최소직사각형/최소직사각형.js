function solution(sizes) {
    var answer = 0;
    
    let maxW = 0; // 가로 최대값
    let maxH = 0; // 세로 최대값
    
    for(let value of sizes){
        //가로, 세로 구조분해할당으로 추출
        const [w, h] = value;
        // 가로, 세로 중 큰 값
        const max = Math.max(w, h);
         // 가로, 세로 중 작은 값
        const min = Math.min(w, h);
        
        //가로 최대값 찾기
        maxW = Math.max(maxW, max);
        //세로 최대값 찾기
        maxH = Math.max(maxH, min);
    }
    //지갑의 크기
     return maxW * maxH;
}