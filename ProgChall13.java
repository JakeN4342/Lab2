import java.util.Scanner;
/**
 * uses the scanner to calculate the tip and tax when entering the meal cost.
 *
 * @author Jake Nicolescu jnicolescu@student.sdccd.edu
 * @version 1.0 2/20/2025
   */
public class ProgChall13
{
   public static void main(String[]args){
   double meal, total, taxAmount, tipAmount, totalPrice;
   final double TAX = 0.0675;//tax rate
   final double TIP = 0.2; //default tip rate
   
   Scanner userInput = new Scanner(System.in);
   System.out.print("Enter Meal Amount: ");
   meal = userInput.nextDouble();
   
   taxAmount = TAX * meal;
   tipAmount = meal * TIP;
   
   totalPrice = meal + taxAmount + tipAmount;
   
   System.out.print("The Tax is: " + taxAmount + 
                    "\nThe Tip Is: " + tipAmount + 
                    "\nThe Meal Cost With Tax and Tip Is: " + totalPrice);
   
   
   
   

   }
}