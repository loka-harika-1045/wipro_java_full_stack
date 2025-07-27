import java.util.Scanner;

public class LastDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int input1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int input2 = scanner.nextInt();
        input1 = Math.abs(input1);
        input2 = Math.abs(input2);
        int sum = (input1 % 10) + (input2 % 10);
        System.out.println(sum);
        scanner.close();
    }
}
