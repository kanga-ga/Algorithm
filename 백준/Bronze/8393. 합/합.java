import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;
        for (int i = 1; i <=a; i++) {
        sum += i;
        }
        System.out.println(sum);
    }
}