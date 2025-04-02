class Solution {
    public int solution(int n) {
        int fact = 1;
        int answer = 0;
        
        for(int i=1; fact <= n; i++) {
            fact *= i;
            if(fact <= n) {
                answer = i;
            }
        }
        
        return answer;
    }
}