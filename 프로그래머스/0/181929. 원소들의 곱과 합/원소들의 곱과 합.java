class Solution {
    public int solution(int[] num_list) {
        int plus = 0;
        int mult = 1;
        int answer = 0;
        for(int num : num_list) {
            plus += num;
            mult *= num;
        }
        if(mult < plus*plus){
            return 1;
        } 
        return 0;
    }
}