function solution(arr1, arr2) {
        let answer = 0;
        if(arr1.length == arr2.length) {
            answer = (arr1.reduce((sum, acc) => sum+acc) == arr2.reduce((sum, acc) => sum+acc) ) ? 0 : (arr1.reduce((sum, acc) => sum+acc) > arr2.reduce((sum, acc) => sum+acc)) ? 1 : -1;
        } else {
            answer = (arr1.length > arr2.length) ? 1 : -1;
        }
       
        return answer;
}


