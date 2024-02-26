function solution(myString, pat) {
    let str = myString.replace(/A/g,"a").replace(/B/g,"A").replace(/a/g,"B");
    return str.includes(pat) ? 1 : 0;
}