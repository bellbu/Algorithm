import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
         List<Integer> list = new ArrayList<>();
        
        for(String str : intStrs) {
            String substr = str.substring(s,s+l);
            int subint = Integer.parseInt(substr);
            if(subint > k) {
               list.add(subint);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}