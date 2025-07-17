package ExceptionDemo;
import java.util.Scanner;
import java.util.InputMismatchException;
public class SquareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        try {
            int number = sc.nextInt(); 
            int square = number * number;
            System.out.println("The square value is " + square);
        } 
        catch (InputMismatchException e) {
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}
