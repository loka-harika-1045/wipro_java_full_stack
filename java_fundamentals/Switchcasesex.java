import java.util.Scanner;
class Switchcasesex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter:");
        int a = scan.nextInt();
        switch(a){
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            case 7: 
                System.out.println("Sunday");
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }
}
