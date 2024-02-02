function solution(n, k) {
    var answer = [];
    var cnt = n/k;
    for(var i = 1; i <= cnt; i++){
        answer.push(i*k);
    }
    return answer;
}