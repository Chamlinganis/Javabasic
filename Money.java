import java.util.Scanner;
public class Money{
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a number");
    int a= scan.nextInt();
    int num= a/20;
    int kill=a%20;
    int dum = kill/10;
    int ki= kill%10;
    int k = ki/5;
    int l = ki%5;
    int m= l/2;
    int n= l%2;
    System.out.println("Number of 20 notes" +num);
    System.out.println("Number of 10 notes" +dum);
    System.out.println("Number of 5 notes" +k);
    System.out.println("Number of 2 notes" +m);
    System.out.println("Number of 1 notes" +n);
    
    }
}