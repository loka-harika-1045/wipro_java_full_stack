import java.util.Scanner;

class LastDigitOfANumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int LD= Math.abs(num%10);
        
        System.out.println("Last Digit Of The Given Numner Is : " + LD);
    }
}
