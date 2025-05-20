import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int size = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i<=r; i++){
            String tmp = Integer.toString(i);
            tmp = tmp.replace("5","").replace("0","");
            
            if(tmp.equals("")){
                list.add(i);
            }
        }
       
        return list.size() == 0? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
        
        
    }
}