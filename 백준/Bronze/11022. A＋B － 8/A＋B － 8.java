import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for (int i = 1; i <= T; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int sum = a + b;
            System.out.printf("Case #%d: %d + %d = %d%n", i, a, b, sum); // ← 여기!
        }
    }
}