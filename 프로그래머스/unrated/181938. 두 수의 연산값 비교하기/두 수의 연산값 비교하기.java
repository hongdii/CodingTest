class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a)+Integer.toString(b);
        int str2 = 2*a*b;
        
        if(Integer.valueOf(str1) > str2){
            answer = Integer.valueOf(str1);
        }else if(Integer.valueOf(str1) < str2){
            answer = Integer.valueOf(str2);
        }else if(Integer.valueOf(str1) == str2){
            answer = Integer.valueOf(str1);
        }
        
        return answer;
    }
}