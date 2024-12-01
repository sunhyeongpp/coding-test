function solution(n, arr1, arr2) {
    return arr1.map((num1, i) => {
    // 두 숫자의 비트 OR 연산 결과를 2진 문자열로 변환
  const binary = (num1 | arr2[i]).toString(2).padStart(n, '0');
        
        // 각 문자를 조건에 따라 '#' 또는 ' '로 변환
        return binary
            .split("")
            .map(char => (char === "1" ? "#" : " "))
            .join("");
    });
}

