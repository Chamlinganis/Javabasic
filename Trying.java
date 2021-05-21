 

import java.util.Scanner;

public class Trying {
    public void main(String[]args) {
          Trying c1= new Trying();
          c1.close();
    Scanner scan = new Scanner(System.in);
    System.out.println ("Hallo");
    System.out.println ("A flag has more then 1 color right?");
    String a = scan.nextLine();
    if (a.equals("yes")) {
        System.out.println ("You arent dumb, nice.");
    } // end of if
    else {
        System.out.println ("You arentn a genie");
    } // end of if-else
}
    public void close() {
         // creates an object of Scanner
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter your name: ");

        // takes input from the keyboard
        String name = s1.nextLine();
        System.out.print("Enter your birth year: ");
        int date  = s1.nextInt();
        int age = 2020 - date;
        
        
        // prints the name
        System.out.println("Your name is " + name);
        System.out.println("Your age is "+ age);

        // closes the scanner
        s1.close();
    }
    
}



