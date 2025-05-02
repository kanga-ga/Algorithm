import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 4의배수 x 100의 배수 x 400의 배수 x
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if ((a%4 ==0 && a %100 !=0 ) || a%400 ==0){
            System.out.println(1);
        }
        else System.out.println(0);
    }
}
