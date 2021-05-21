import java.util.Scanner;
public class Project7{
    public static void main(String[] args){
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your anual income");
         a= sc.nextDouble();
        if(a<=100000){
                System.out.println("NO tax");
        }
        else if( a<=150000){
         b=(a-100000)/100*10;
         System.out.println("You have to pay Rs"+b);
            
        }
        else if( a<=250000){
            b=((a-150000)/100*20)+5000;
            System.out.println("You have to pay Rs"+b);
        }
        else if(a>250000){
            b=((a-250000)/100*30)+25000;
            System.out.println("You have to pay Rs"+b);
        }
    }
}