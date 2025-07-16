import java.util.Scanner;
public class Stringlentrim{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s1 = sc.nextLine();
        StringBuilder d = new StringBuilder(s1);
        int n = d.length();
        while (n > 0) {
            --n;
            System.out.print(d.substring(0,2));
        }
    }
}

