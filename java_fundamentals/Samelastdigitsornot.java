import java.util.Scanner;
class Samelastdigitsornot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%10 == b%10){
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
