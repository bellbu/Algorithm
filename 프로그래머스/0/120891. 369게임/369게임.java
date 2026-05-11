class Solution {
    public int solution(int order) {
        int answer = 0;
        String odr = String.valueOf(order);
        for(int i=0; i < odr.length(); i++) {
            char ch = odr.charAt(i);
            int num = ch - '0';
            if(num != 0 && num % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}