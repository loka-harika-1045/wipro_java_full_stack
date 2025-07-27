import java.util.Scanner;
public class ExactMultipleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int N = scanner.nextInt();
        System.out.print("Enter value of M: ");
        int M = scanner.nextInt();
        if (M == 0) {
            System.out.println("Division by zero is not allowed.");
        } else if (N % M == 0) {
            System.out.println("Yes, " + N + " is an exact multiple of " + M);
        } else {
            System.out.println("No, " + N + " is not an exact multiple of " + M);
        }
    }
}
