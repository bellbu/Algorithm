import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 1;
        int length = my_string.length() < is_prefix.length() ? my_string.length() : is_prefix.length();  
        for(int i = 0; i < length; i++) {
            if(my_string.charAt(i) != is_prefix.charAt(i) || my_string.length() < is_prefix.length()) {
                answer = 0;
            }
        }
        return answer;
    }
}