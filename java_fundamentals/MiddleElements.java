import java.util.Scanner;
public class MiddleElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];

        System.out.println("Enter 3 numbers for first array:");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter 3 numbers for second array:");
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        System.out.print("[" + a[1]+" ");
        System.out.print(b[1]+"]");
    }
}
