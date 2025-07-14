import java.util.Scanner;
public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter size of array");
        a = sc.nextInt();
        int x[] = new int[a];
        System.out.println("Enter integers for the array:");
        for (int i = 0; i < x.length ; i++) {
            x[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < x.length ; i++) {
    System.out.println("Element at index : " + i + " is :"+ x[i]);
     sum = sum + x[i];
}
System.out.println("The sum of values is "+sum);
int avg=sum / a;
System.out.println("The avg of values is "+avg);
}
}
