class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int j = 0;
        for(int num : num_list) {
            if(num < 0) {
                return j;
            }
            j++;
        }
        return -1;
    }
}