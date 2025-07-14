import java.util.Scanner;
class CommasBwtString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values separated by spaces: ");
        String input = sc.nextLine(); 
        if (input.isEmpty()) {
            System.out.println("No Values");
        } else {
            String[] values = input.split(" ");
            String result = String.join(",", values);
            System.out.println(result);
        }
    }
}
