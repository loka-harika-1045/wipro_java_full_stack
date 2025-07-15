import java.util.Scanner;
public class SearchElement{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF ARRAY");
    int num=sc.nextInt();
    int[] arr=new int [num];
    System.out.println("Enter the array elements");
    for(int i=0;i<num;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the search element");
    int search=sc.nextInt();
    int value=-1;
    for(int i=0;i<num;i++){
        if(arr[i]==search){
            value=i;
        }
    }
    System.out.println("Result "+value);
}}
