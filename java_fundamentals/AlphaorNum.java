import java.util.Scanner;
class AlphaorNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char var = scan.next().charAt(0);
        if((var>=65 && var <=90) || (var>=97 && var<=122))
        {
            System.out.println("Alphabet");
        }
        else if(var>=48 && var <=57){
            System.out.println("Number");
        }
        else{
            System.out.println("Symbol");
        }
    }}
