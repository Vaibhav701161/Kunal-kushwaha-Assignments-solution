package Assignment1;
import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in INR: ");
        Double INR = scanner.nextDouble();
       

        Double amount = INR / 83.4;
        System.out.println("The amount in USD is: " + amount);
        scanner.close();
    }
}
