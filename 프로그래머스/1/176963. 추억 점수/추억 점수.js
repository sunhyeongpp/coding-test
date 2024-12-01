function solution(name, yearning, photo) {
    // 이름과 점수를 맵핑하는 객체 생성
    const scoreMap = name.reduce((map, person, index) => {
        map[person] = yearning[index];
        return map;
    }, {});

    // 사진 배열에서 각 그룹의 점수 계산
    return photo.map(group => 
        group.reduce((score, person) => score + (scoreMap[person] || 0), 0)
    );
}
