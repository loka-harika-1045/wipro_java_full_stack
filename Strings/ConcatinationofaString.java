import java.util.Scanner;
public class ConcatinationofaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 Strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder d = new StringBuilder(s1);
        d.append(s2);
        String lo = d.toString().toLowerCase();
        System.out.println(lo);
    }
}
