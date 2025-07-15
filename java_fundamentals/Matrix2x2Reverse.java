import java.util.Scanner;

public class Matrix2x2Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int index = 0;
        System.out.println("Enter 4 numbers:");

        while (index < 4) {
            if (sc.hasNextInt()) {
                arr[index++] = sc.nextInt();
            } else {
                System.out.println("Please enter an integer:");
                sc.next();
            }
        }

        System.out.println("Original Matrix:");
        System.out.println(arr[0] + " " + arr[1]);
        System.out.println(arr[2] + " " + arr[3]);

        for (int i = 0; i < 2; i++) {
            int temp = arr[i];
            arr[i] = arr[3 - i];
            arr[3 - i] = temp;
        }
        System.out.println("Reversed Matrix:");
        System.out.println(arr[0] + " " + arr[1]);
        System.out.println(arr[2] + " " + arr[3]);
    }
}
