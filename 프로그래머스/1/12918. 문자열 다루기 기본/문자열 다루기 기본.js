function solution(s) {
   return (s.length === 6 || s.length === 4) && s.split("").every((char) => !isNaN(char));
}

/* 첫 번째 시도
function solution(s) {
   return s.length===6 ||s.length===4 && !isNaN(s)
}
=>"12e3"은 지수표기법이라 isNaN(s)가 false여서 한계가 있음.
*/