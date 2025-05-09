import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        while (a!=0 && b!=0){
            System.out.println(a+b);
            a = input.nextInt();
            b = input.nextInt();

            

        }


    }
}
