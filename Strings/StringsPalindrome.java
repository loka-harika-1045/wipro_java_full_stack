import java.util.Scanner;
public class StringsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s1 = sc.nextLine();
        StringBuilder d = new StringBuilder(s1);
        String revs1 = d.reverse().toString();
        if(revs1.equals(s1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
