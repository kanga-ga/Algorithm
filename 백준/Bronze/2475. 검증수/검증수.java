import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total =0;
        for (int i = 1; i <=5 ; i++) {
        int a = input.nextInt();
        int sum=a*a;
        total+=sum;
        }
        System.out.println(total%10);
    }
}
