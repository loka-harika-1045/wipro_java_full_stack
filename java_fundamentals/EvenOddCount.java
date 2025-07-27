import java.util.Scanner;
class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 5 elements");
        int evencount=0;
        int oddcount=0;
        for(int i=0;i< 5;i++){
           int r=sc.nextInt(); 
           if(r % 2 == 0){
               evencount++;
           }
           else{
               oddcount++;
           }
        }
        System.out.println("Even Elements Count " + evencount);
        System.out.println("Odd Elements Count " + oddcount);
    }
}
