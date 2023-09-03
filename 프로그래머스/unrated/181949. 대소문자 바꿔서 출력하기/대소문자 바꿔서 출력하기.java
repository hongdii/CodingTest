import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String output ="";
        char temp;
        
        for(int i=0 ; i<a.length() ; i++){
            temp = a.charAt(i);
            
            if((65<= temp) && (temp<= 90)){ // 대문자
                output += a.valueOf(temp).toLowerCase();
            }else if( (97<= temp) && (temp<=122)){
                output += a.valueOf(temp).toUpperCase();
            }else{
                output += (char)temp;
            }
            
        }
        System.out.print(output);
    }
}