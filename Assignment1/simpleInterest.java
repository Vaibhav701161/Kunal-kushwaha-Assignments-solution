package Assignment1;
import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        Double principal = p.nextDouble();
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the rate of interest: ");
        Double rate = r.nextDouble();
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the time in years: ");
        Double time = t.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

    }
}
