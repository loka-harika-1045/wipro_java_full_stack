package ExceptionDemo;
import java.util.Scanner;
public class ArithmeticExceptionDemo {
public static void main(String[] args) {
try {
			System.out.println("Enter a value");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int x= 2/a;
			System.out.println(x);
	}
catch( ArithmeticException x ) {
	System.out.println("Division of zero error");
}
}
	

}
