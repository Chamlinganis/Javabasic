import java.util.Scanner;
public class Code{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        int b= (a%10);
        System.out.println(b);
        int c=(a/10);
        int d=(c%10);
         System.out.println(d);
         int e=(c/10);
        int f=(e%10);
        System.out.println(f);
        int g=(e/10);
        int h=(g%10);
        System.out.println(h);
        int j=(g/10);
        int i=(j%10);
        System.out.println(i);
    }
}