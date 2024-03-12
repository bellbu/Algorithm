class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        // 문자열 검색 ex 포함도는지 포함되면 제외 포함안되면 합치기
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].contains(ex)){
                
            }else{
                answer += str_list[i];
            }
        }
        return answer;
    }
}