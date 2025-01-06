function solution(sizes) {
    var answer = 0;
    
    let maxW = 0;
    let maxH = 0;
    
    for(let value of sizes){
        const [w, h] = value;
        const max = Math.max(w, h);
        const min = Math.min(w, h);
        
        maxW = Math.max(maxW, max);
        maxH = Math.max(maxH, min);
    }
     return maxW * maxH;
}