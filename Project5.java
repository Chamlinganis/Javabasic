 
import java.util.Scanner;
public class Project5{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a character");
    char a= sc.nextLine().charAt(0); 
    if (a>=65 && a<=90 ){
         int b= ((int)a+32);
       System.out.println((char)b);    
    }
    else if(a>=97 && a<=122){
         int b= ((int)a-32);
       System.out.println((char)b);  
    }
    else{
        System.out.println("Wrong input");
    }
}
}


