import java.util.Scanner;
public class StringEvenHalfIt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() % 2 == 0) {
            System.out.println(s.substring(0, s.length() / 2));
        } else {
            System.out.println("null");
        }
    }
}
