import java.util.Scanner;
class Ascii {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char var = sc.next().charAt(0);
        System.out.println((int)var);
    }
}
