import java.util.Scanner;
/**
 * This program you enter your favorite city and displays in uppercase, lowercase, and first letter.
 *
 * @author Jake Nicolescu jnicolescu@student.sdccd.edu
 * @version 1.0 2/13/2025
 */
public class ProgChall12 {
    public static void main(String[]args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter A City:");
        String city = userInput.nextLine();
        
        int length = city.length();
        
        System.out.println("The City Entered Has:" + length);
        String uppercase = city.toUpperCase();
        System.out.println("In UpperCase:" + uppercase);
        
        String lowercase = city.toLowerCase();
        System.out.println("In LoerCase:" + lowercase);
        
        System.out.println("The First Letter Is:" +city.charAt(0));
    }
}