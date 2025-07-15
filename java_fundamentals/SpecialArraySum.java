import java.util.Scanner;
public class SpecialArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        boolean skip = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 6) {
                skip = true; // Start ignoring numbers
            } else if (arr[i] == 7 && skip) {
                skip = false; // Stop ignoring after 7
            } else if (!skip) {
                sum += arr[i];
            }
        }
System.out.println("Sum of array elements (ignoring between 6 and 7): " + sum);
    }
}
