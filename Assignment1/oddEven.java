package Assignment1;
import java.util.Scanner;

public class oddEven{
    public static void main(String[] args) {
        Scanner oddEven = new Scanner(System.in);
        System.out.println("please enter the number: ");
        int number = oddEven.nextInt();

        if(number%2 == 0){
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
       
    }
}