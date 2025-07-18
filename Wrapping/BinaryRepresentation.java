package Datatyperanges;
import java.util.Scanner;
public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 255: ");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        if (number < 1 || number > 255) {
            System.out.println("Invalid input! Please enter a number between 1 and 255.");
        } else {
            String binary = Integer.toBinaryString(number);
            System.out.println(String.format("%8s", binary).replace(' ','0'));
        }
    }
}
