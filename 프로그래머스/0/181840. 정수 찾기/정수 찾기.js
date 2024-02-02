function solution(num_list, n) {
    var answer = 0;
    num_list.forEach((num, i) => {
        if(num === n) {
            answer = 1;
        }
    });
    return answer;
}