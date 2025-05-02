import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 1; i <=a ; i++) {
            int b = input.nextInt() + input.nextInt();
            System.out.println(b);    
        }
        
    }
}
