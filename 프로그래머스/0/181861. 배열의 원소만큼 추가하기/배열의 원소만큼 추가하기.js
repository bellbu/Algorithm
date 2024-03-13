function solution(arr) {
    return arr.reduce((accumulator, currentValue) => accumulator.concat(Array(currentValue).fill(currentValue)), []);
}
