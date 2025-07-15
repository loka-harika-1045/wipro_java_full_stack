import java.util.Scanner;
public class Asciinumberstosymbolsofanarray{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF ARRAY");
    int num=sc.nextInt();
    int[] arr=new int [num];
    int[] out=new int [num];
    System.out.println("Enter the array elements");
    for(int i=0;i<num;i++){
        arr[i]=sc.nextInt();
        out[i]=(char)arr[i];
            System.out.println("Result "+ (char)out[i]);
    }

}}
