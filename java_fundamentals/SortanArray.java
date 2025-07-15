import java.util.Arrays;
import java.util.Scanner;

public class SortanArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] Array = new int[size];
        System.out.println("Enter " + size + " values");
        for (int i = 0; i < size; i++) {
            Array[i] = sc.nextInt();
        }
        Arrays.sort(Array);
        for (int i = 0; i < size; i++) {
            System.out.print(Array[i]+ "\t");
        }       
    }
}
