function solution(nums) {
    var answer = 0;
    
    let newnums = [...new Set(nums)];
    
    answer = newnums.length < nums.length/2 ? newnums.length: nums.length/2;
    
    return answer;
}

//1. nums에서 중복되지 않는 숫자 종류만 포함하는 새 배열을 만든다. 
//2. 새 배열이 nums.length/2보다 작으면 새 배열의 길이를, 
// nums.length/2보다 크거나 같으면 nums.length/2를 반환한다. 