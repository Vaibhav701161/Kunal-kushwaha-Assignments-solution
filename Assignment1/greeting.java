package Assignment1;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner greetings = new Scanner(System.in);
        System.out.print("please enter your name:  ");
        String name = greetings.next();
        System.out.println("namaste " + name);
    }
}
