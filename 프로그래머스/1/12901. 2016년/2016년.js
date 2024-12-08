function solution(a, b) {
    var answer = '';
    const week = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"];
    const day = new Date(2016, a-1, b);
 weekNum = day.getDay();
    answer = week[weekNum];
    return answer;
}