import java.util.Scanner;
public class cal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Write a value of a");
        int a= sc.nextInt();
        System.out.println("Enter the value of b");
        int b= sc.nextInt();
         System.out.println("Enter the value of c");
         int c= sc.nextInt();
         int sum=a+b+c;
         System.out.println("Sum is "+sum);
         
    }
}