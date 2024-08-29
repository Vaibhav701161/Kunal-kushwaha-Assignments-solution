package Assignment1;
import java.util.Scanner;
public class largestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number:  ");
        double num1 = scanner.nextDouble();

        System.out.println("enter the second number: ");
        double num2 = scanner.nextDouble();

        if (num1>num2) {
            System.out.println(num1 + " is greater");
        } else if (num1<num2) {
            System.out.println(num2 + " is greater");
        }else{
            System.out.println("numbers are equal");
        }
        scanner.close();
    }
}
