import java.util.Scanner;
public class SecondLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        num = Math.abs(num);
        if (num < 10) {
            System.out.println(-1);
        } else {
            int secondLast = (num / 10) % 10;
            System.out.println(secondLast);
        }
        scanner.close();
    }
}
