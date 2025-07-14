import java.util.Scanner;
class AscendingOrderof2Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 alphabets");
        char input1 = sc.next().charAt(0); 
        char input2 = sc.next().charAt(0);
        if( input1 <  input2)
        {
            System.out.println(input1+","+input2);
        }
        else{
            System.out.println(input2+","+input1);
        }
        
    }}
