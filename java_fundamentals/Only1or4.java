import java.util.Scanner;
public class Only1or4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        boolean result = true;
        for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        if (num != 1 && num != 4) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
