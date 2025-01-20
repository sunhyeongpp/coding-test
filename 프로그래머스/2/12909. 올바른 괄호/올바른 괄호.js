function solution(s){
    var answer = true;

    let stack = [];
    for(let i=0; i<s.length; i++){
        if(s[i]==='(') stack.push(')');
        else if(s[i]===')'&& stack.length!==0) stack.pop();
        else if(s[i]===')'&& stack.length===0) return false
    }
    if(stack.length >0) answer = false;
    return answer;
}