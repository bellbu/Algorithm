import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length == arr2.length) {
            answer = (Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum()) ? 0 : (Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum()) ? 1 : -1;
        } else {
            answer = (arr1.length > arr2.length) ? 1 : -1;
        }
       
        return answer;
    }
}