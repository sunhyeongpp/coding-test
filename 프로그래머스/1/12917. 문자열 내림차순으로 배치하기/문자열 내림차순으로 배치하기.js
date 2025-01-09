function solution(s) {
    var answer = '';
    answer = s.split("").sort((a,b)=>b.charCodeAt(0)-a.charCodeAt(0)).join("");
    return answer;
}

/*다른 풀이1
function solution(s) {
  return s
    .split("")
    .sort()
    .reverse()
    .join("");
}

다른 풀이2
function solution(s) {
    return s.split("").sort((a,b) => a<b ? 1:-1).join("")
}
*/