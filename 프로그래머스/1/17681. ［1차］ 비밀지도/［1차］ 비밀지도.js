function solution(n, arr1, arr2) {
    var answer = [];
    
    // 배열의 각 요소를 2진법 문자열로 변환
    const newArr1 = arr1.map(value=> value.toString(2).padStart(n,0));
    const newArr2 = arr2.map(value=> value.toString(2).padStart(n,0));
    
    for (let i = 0; i < n; i++) {
        let line = '';
        for (let j = 0; j < n; j++) {
            // 둘 중 하나라도 1이면 "#" 그렇지 않으면 " "
            line += (newArr1[i][j] === '1' || newArr2[i][j] === '1') ? '#' : ' ';
        }
        answer.push(line);
    }

    return answer;
}

// arr1과 arr2의 각 인덱스별 값을 2진법으로 변환해야 함 (toString()메서드 활용)
// 2진법으로 이루어진 newArr1, newArr2를 생성
// 각 value의 각 자릿수별로 인덱스에 넣은 배열로 변환 ex ["1","0","1","1","1"]
// 배열 순회하며 1=> #으로, 0=>" "으로 바꾸기
// 바뀐 배열을 공백 없이 문자열로 변환, 변환된 문자열들을 하나의 배열로 묶기.
// 두 배열의 같은 인덱스 값이 모두 공백이면 공백, 아니면 #로 변환