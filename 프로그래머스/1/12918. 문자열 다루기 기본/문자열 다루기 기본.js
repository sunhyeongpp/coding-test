function solution(s) {
   return (s.length === 6 || s.length === 4) && s.split("").every((char) => !isNaN(char));
}

/* 첫 번째 시도
function solution(s) {
   return s.length===6 ||s.length===4 && !isNaN(s)
}
=>"12e3"은 지수표기법이라 isNaN(s)가 false여서 한계가 있음.

isNaN이 숫자 아닌 경우에도 false 반환하는 경우
1) " " (공백): 공백은 숫자 0으로 변환되므로 isNaN은 false를 반환
2) boolean 값: true와 false는 각각 숫자 1과 0으로 변환되므로 isNaN은 false를 반환
3) null: 숫자 0으로 변환되므로 isNaN은 false를 반환

*/