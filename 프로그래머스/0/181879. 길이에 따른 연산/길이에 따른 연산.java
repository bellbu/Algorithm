class Solution {
    public int solution(int[] numlist) {
        int answer = 0;
        if(numlist.length >= 11){
            for(int i=0; i < numlist.length; i++) {
                answer += numlist[i];
            }
            return answer;
        }
        
        int first = 1;
        for(int num : numlist) {
            first *= num;
        }
        return first;
        
    }
}