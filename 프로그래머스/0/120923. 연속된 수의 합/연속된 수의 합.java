import java.util.*;

class Solution {
    public List<Integer> solution(int num, int total) {
        List<Integer> answer = new ArrayList<>();
        
        int start = total / num - (num - 1) / 2;
        
        for (int i = 0; i < num; i++) {
            answer.add(start + i);
        }
        
        return answer;
    }
}