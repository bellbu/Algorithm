function solution(myString, pat) {
    return [...myString].map((vlaue) => vlaue === 'A' ? 'B' : 'A').join('').includes(pat) ? 1 :0;
}
