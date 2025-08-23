class Solution {
    public int solution(int hp) {
        int answer = 0;
        for(int i = 5; i >= 1; i -= 2) { // 5, 3, 1 반복
            answer += hp/i; // 개미 수
            hp %= i;        // 남은 hp
            if(hp == 0) {
                break;
            }
        }
        return answer;
    }
}