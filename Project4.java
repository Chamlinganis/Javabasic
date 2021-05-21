import java.util.Scanner;
public class Project4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        if(a%2==0 && a%5==0){
                System.out.println(a+" is even number and divisible by 5");
        }
        else if(a%2==0 && a%5!=0) {
        System.out.println(a+" is even but not divisble by 5");
        }
        else if (a%2!=0 && a%5==0) {
            System.out.println(a+" is not even but  divisble by 5");
        }
        else{
            System.out.println(a+" is  not even number and not divisible by 5");
        }
        
    }
}