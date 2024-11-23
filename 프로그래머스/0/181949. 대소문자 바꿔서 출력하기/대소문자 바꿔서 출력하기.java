import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result ="";
        for(char c: a.toCharArray()){
            if(c== Character.toLowerCase(c)){
                result +=Character.toUpperCase(c);
            } else{
                result+= Character.toLowerCase(c);
            }
        }
   System.out.print(result);
        
    
    }
}