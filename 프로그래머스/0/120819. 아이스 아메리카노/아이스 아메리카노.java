class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int num = money/5500;
        int change = money-(5500*num);
        answer[0] = num;
        answer[1] = change;
        return answer;
    }
}