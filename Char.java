 
import java.util.Scanner;
public class Char{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a character");
    char a= sc.nextLine().charAt(0); 
    if (a>=65 && a<=90 ){
       System.out.println("It is uppercase");    
    }
    else if(a>=97 && a<=122){
        System.out.println("It is lowercase");
    }
    else{
        System.out.println("Wrong input");
    }
}
}
