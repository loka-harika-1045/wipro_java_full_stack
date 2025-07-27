import java.util.Scanner;
public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int fact =1;
        if(num<1){
            System.out.println("Factorial is not present for negative numbers");
        }
        else 
        for(int i=1;i<=num;i++){
            fact=fact* i;
        }
            System.out.println(fact);
        }
    }

