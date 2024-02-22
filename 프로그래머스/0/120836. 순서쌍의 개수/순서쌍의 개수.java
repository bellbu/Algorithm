class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                answer++;
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
*/