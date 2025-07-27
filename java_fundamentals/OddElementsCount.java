import java.util.Scanner;
class OddElementsCount{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 5 elements");
        int count=0;
        for(int i=0;i< 5;i++){
           int r=sc.nextInt(); 
           if(r % 2 != 0){
               count++;
           }
        }
        System.out.println("Odd Elements Count" + count);
    }
}
