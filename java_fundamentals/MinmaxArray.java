import java.util.Scanner;
public class MinmaxArray{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int[] arr=new int [num];
    for(int i=0;i<num;i++){
        arr[i]=sc.nextInt();
    }
    int min= arr[0];
    int max= arr[0];
    for(int i=0;i<num;i++){
        if(arr[i]<min){
            min=arr[i];
        }
        else if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println("max "+max);
    System.out.println("mini "+min);
}}
