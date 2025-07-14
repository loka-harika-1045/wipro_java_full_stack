import java.util.Scanner;
class GenderAgeInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender (Male/Female): ");
        String gender = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
    if (gender.equals("Female") && age >= 1 && age <= 58) {
            System.out.println("Interest rate: 8.2%");
        } 
else if (gender.equals("Female") && age >= 59 && age <= 100) {
            System.out.println("Interest rate: 9.2%");
        } else if (gender.equals("Male") && age >= 1 && age <= 58) {
            System.out.println("Interest rate: 8.4%");
        } else {
            System.out.println("Invalid input");
        }
    }
}
