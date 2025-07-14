import java.util.Scanner;
class PosNegZer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        if(s1<0){
            System.out.println("Negative");
        }
        else if(s1>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Zero");
        }
        }
}
