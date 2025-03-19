import java.io.Console;
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    //Display Program Title
    System.out.println("INFOMATION INPUT");
    //
    System.out.print("What is your first name?: ");
    //Object to read and store first name.
    String firstName = myObj.nextLine();  // Read user input
    //Object to read and store last name.
    System.out.print("What is your last name?: ");
    String lastName = myObj.nextLine();  // Read user input
    //Object to read and store age.
    System.out.print("What is your age?: ");
    String age = myObj.nextLine();  // Read user input
    //Object to read and store color.
    System.out.print("What is your favorite color?: ");
    String color = myObj.nextLine();  // Read user input
   
    System.out.print("Hello, " + firstName + " " + lastName + "!" + " You are " + age + " years old and your favorite color is " + color + ".");


  }
}