import java.util.*;

class Solution {
    public int solution(String my_string) {
        my_string= my_string.replaceAll("[A-Z|a-z]","");
        String[] num = my_string.split("");
        int answer = 0;
        for(int i = 0; i < num.length; i++) {
            answer += Integer.parseInt(num[i]);
        }
        return answer;
    }
}