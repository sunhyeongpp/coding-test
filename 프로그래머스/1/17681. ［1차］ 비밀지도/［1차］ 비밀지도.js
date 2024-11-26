function solution(n, arr1, arr2) {
    var answer = [];
    
    // 배열의 각 요소를 2진법 문자열로 변환
    const newArr1 = arr1.map(value=> value.toString(2).padStart(n,"0"));
    const newArr2 = arr2.map(value=> value.toString(2).padStart(n,"0"));
    
    for(let i =0; i<n; i++){
        let line = "";
        for(let j=0; j<n; j++){
            line+= (newArr1[i][j]==="1" || newArr2[i][j]==="1")? "#" : " ";
        }
        answer.push(line);
    }
    return answer;
}

