package Assignment1;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int n = scanner.nextInt();
        int fib0 = 0 ;
        int fib1 = 1;
        System.out.println("Fibonacci series: ");
        for (int i = 1; i < fib0; i++) {
            System.out.print(fib0 + " ");
            int fib2 = fib0 + fib1;
            fib0 = fib1;
            fib1 = fib2;
        }
        scanner.close();
    }
}
