import java.util.Scanner;
public class NumSum
{ 
   double n1, n2;
    public static void main(String [] args){
        
         Scanner scan= new Scanner(System.in);
         NumSum s1 = new NumSum();
         System.out.println("enter n1");   
         s1.n1=scan.nextDouble();
         System.out.println("Enter n2");
         s1.n2=scan.nextDouble();   
     System.out.println("Sum is "+s1.sum(s1.n1,s1.n2));
     System.out.println("Diff is "+s1.diff(s1.n1,s1.n2));
     System.out.println("Mul is "+s1.mul(s1.n1,s1.n2));
     System.out.println("Division is "+s1.div(s1.n1,s1.n2));
     System.out.println("Remainder is "+s1.remainder(s1.n1,s1.n2));
    }
    public double sum(double a,double b){
        double sum = a+b;
        return sum;
    }
    public double diff(double a, double b){
     double diff = a-b;
     return diff;
    }
    public double mul(double a, double b){
     double mul=a*b;
     return mul;
    }
    public double div(double a, double b){
        double div= a/b;
        return div;
    }
    public double remainder(double a, double b){
        double remainder= a%b;
        return remainder;
    }
}
 