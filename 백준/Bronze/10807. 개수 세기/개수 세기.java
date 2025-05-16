import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b[] = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = input.nextInt();
        }
        int c = input.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (b[i] == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}