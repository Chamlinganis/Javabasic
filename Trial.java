import java.util.*; //giving commands for scanner 
 public class Trial
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
System.out.print("Enter first number- ");  //Asking for variable from user
float a= sc.nextFloat();  //Accepts variable from the users 
System.out.print("Enter second number- ");  
float b= sc.nextFloat();  
System.out.print("Enter third number- ");  
float c= sc.nextFloat();  
float d=a+b+c;  
float e=a*b*c;
float f=a/b;
System.out.println("Total sum= " +d);  
System.out.println("total mul= " +e); 
System.out.println(a+"/"+b+"= "+f);
}  
}
