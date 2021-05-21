 
import java.util.Scanner;
import java.lang.Math;
public class Projet9{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 'R' to find area of Rectangle"+" 'C' for Circle" +"'S' for square");
            char d= sc.nextLine().charAt(0); 
            if(d== 'R' || d=='r'){
            System.out.println("Enter length of rectangle");
            Double a= sc.nextDouble();
            System.out.println("Enter breadth of rectangle");
            Double b= sc.nextDouble();
            Double i= a*b;
            System.out.println("The area of rectangle is"+i);
        }
            else if(d== 'C'|| d=='c'){
            System.out.print("Enter the radius of circle");
            double e= sc.nextDouble();
            double area= Math.PI*e*e;
            System.out.print("The area of circle is"+ area);
        }
            else if(d== 'S' || d=='s'){
             System.out.print("Enter the side of square");
            double f= sc.nextDouble();
            double g= f*f;
            System.out.print("The area of square is"+ g);
            }
            else {
            System.out.println("Wrong character input. PLease try again");
            }
    }
    }
