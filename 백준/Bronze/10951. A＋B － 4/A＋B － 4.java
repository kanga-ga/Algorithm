import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       while(input.hasNext()){
           int a = input.nextInt();
           int b = input.nextInt();
           int sum = a+b;
           System.out.println(sum);
       }

    }
}