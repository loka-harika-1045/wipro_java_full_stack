public class Overloading{
    public static void main(String[] args){
        Calsi calac=new Calsi();
System.out.println("polymorphism overload ex " + calac.add(2,3) );
System.out.println("polymorphism overload ex " + calac.add(2,3,4) );
System.out.println("polymorphism overload ex " + calac.add(2.09,3.87,8.65) );
    }}
class Calsi{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b,double c){
        return a+b+c;
    }

}
