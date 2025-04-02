class Solution {
    public int solution(int n) {
        int fact = 1;
        int i = 1;
        
        while(fact <= n) {
            fact *= i;
            if(fact > n) break;
            i++;
        }
        
        return i - 1;
        
    }
}