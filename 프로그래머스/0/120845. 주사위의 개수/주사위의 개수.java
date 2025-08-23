class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int width = box[0] / n;
        int vertical = box[1] / n;
        int height = box[2] / n;
        answer = width*vertical*height;
        return answer;
    }
}