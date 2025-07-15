import java.util.Arrays;
import java.util.Scanner;
public class Largest2andSmallest2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] asciiArray = new int[size];
        System.out.println("Enter " + size + " values");
        for (int i = 0; i < size; i++) {
            asciiArray[i] = sc.nextInt();
        }
        Arrays.sort(asciiArray);
        System.out.println("\nSmallest 2 ASCII values:");
        for (int i = 0; i < 2 && i < size; i++) {
            System.out.println(asciiArray[i]);
        }
        System.out.println("\nLargest 2 ASCII values:");
        for (int i = size - 2; i < size && i >= 0; i++) {
            System.out.println(asciiArray[i]);
        }
    }
}
