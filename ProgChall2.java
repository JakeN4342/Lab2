import java.util.Scanner;
/**
 * I made user name project that displays initals and bame
 *
 * @author Jake Nicolescu jnicolescu@student.sdccd.edu
 * @version 2.0 2/11/2025
 */
public class ProgChall2 { 
    public static void main(String[]args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Your First Name");
        String firstName = userInput.nextLine();
        
        System.out.print("Enter Your Middle Name");
        String middleName = userInput.nextLine();
        
        System.out.print("Enter Your last Name");
        String lastName = userInput.nextLine();
        
        System.out.print("My Name Is: " + firstName + " " + middleName + " " + lastName);
        System.out.print("\nMy Initials Are: " +firstName.charAt(0)+middleName.charAt(0)+lastName.charAt(0));
        
        userInput.close();
    }
}