function solution(s, n) {
    return s.split('').map(char => {
        if (char === ' ') return char; // 공백은 그대로
        const charCode = char.charCodeAt(0);
        const base = char >= 'a' ? 97 : 65; // 소문자와 대문자 구분
        return String.fromCharCode((charCode - base + n) % 26 + base);
    }).join('');
}