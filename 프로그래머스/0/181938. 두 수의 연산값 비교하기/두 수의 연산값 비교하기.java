class Solution {
    public int solution(int a, int b) {
        String combined = String.valueOf(a) + String.valueOf(b);
        int plusInt = Integer.parseInt(combined);
        int multiplyInt = 2*a*b;
        if(plusInt >= multiplyInt) {
            return plusInt;
        }
        return multiplyInt;
    }
}