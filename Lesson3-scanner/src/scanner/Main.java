package scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("give first number: ");

        int firstNumber = scanner.nextInt();

        System.out.println("give second number: ");

        int secondNumber = scanner.nextInt();

        System.out.println("Solution: ");
        System.out.println(firstNumber + secondNumber);
    }
}
