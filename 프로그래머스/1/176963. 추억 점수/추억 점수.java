import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int index = 0;
        
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<name.length;i++){
            map.put(name[i], yearning[i]);
        }
        
        for(String[] p : photo){
            int sum = 0;
            for(String str : p){
                if(map.get(str)!=null){
                    sum += map.get(str);
                }else{
                    sum+=0;
                }
            }
            answer[index] = sum;
            index+=1;
        }
        
        return answer;
    }
}