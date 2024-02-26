class Solution {
    public int solution(String myString, String pat) {
        String str = myString.replace("A","a").replace("B","A").replace("a","B");
        return str.contains(pat) ? 1 : 0;
        
    }
}
