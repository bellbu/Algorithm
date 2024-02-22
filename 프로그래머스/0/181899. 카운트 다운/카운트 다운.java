class Solution {
    public int[] solution(int start, int end_num) {
        int num = start - end_num + 1;
        int[] answer = new int[num];
        for(int i = start; i >= end_num; i--){
            answer[start-i] = i;
        }
        return answer;
    }
}