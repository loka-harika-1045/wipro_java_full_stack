import java.util.Scanner;
public class ArrayWithoutTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 10) {
                result[index] = arr[i];
                index++;
            }
        }
        System.out.print("Array after removing 10s: [");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i]);
            if (i != size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
