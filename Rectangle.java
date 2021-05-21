import java.util.Scanner;
public class Rectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         
        System.out.println("enter length ");
        double a= sc.nextDouble();
        System.out.println("Enter breadth");
        double b= sc.nextDouble();
         System.out.println("Enter height");
         double c= sc.nextDouble();
         double s = (a+b+c)/2;
         double area=Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
         System.out.println("perimeter= "+s);
         System.out.println("Area=" +area);
    }
}