import java.util.Scanner;
class Calculator {
    public static int powerInt(int num1, int num2) {
        return  (int)Math.pow(num1, num2);
    }
    public static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }
    public static void main(String[] args) {
        int a= Calculator.powerInt(2,3);
        System.out.println(a);
        double b= Calculator.powerDouble(2.0,3.99);
        System.out.println(b);
    }
}
