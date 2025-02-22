import javax.swing.JOptionPane;
/**
 * ProgChall15 is about using JOption and multiplying the user imputs,
 * it will show the cost of the shares with the commission price.
 *
 * @author Jake Nicolescu jnicolescu@student.sdccd.edu
 * @version Febuary 18, 2025
 */
public class ProgChall15
{ 
    public static void main(String[]args){
        int numShares;
        double pricePerShare, totalCostShares, commission, total;
        final double COMM_RATE= 0.02;
        commission = 1.02;
    
        String price = JOptionPane.showInputDialog("Enter Cost Per Share:");
        pricePerShare = Double.parseDouble(price);
        String temporary = JOptionPane.showInputDialog("Enter Number of Shares:");
        numShares = Integer.parseInt(temporary);
        //JOptionPane.showMessageDialog(null, "The Total Cost of Shares Are:");
        //JOptionPane.showMessageDialog(null, "The Amount of Shares are:");
        
        double TotalCostofShares = pricePerShare * numShares;
        double CommissionPercent = pricePerShare * numShares * COMM_RATE;
        double FinalTotal = pricePerShare * numShares * commission;
        
        JOptionPane.showMessageDialog(null, "The Total Cost is:" + TotalCostofShares +
                                        "\nThe Commision Cost is:" + CommissionPercent +
                                        "\nThe Total is:" + FinalTotal);
    }
} 

