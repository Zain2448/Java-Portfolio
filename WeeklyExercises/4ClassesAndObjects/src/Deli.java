// Computes the price of a deli item given the weight
// (in ounces) and price per pound -- prints a label,
// nicely formatted, for the item.

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
/*
    The following source code contains a partial program that computes the cost of
    buying an item at a deli.

        3) Add the statement to declare money to be a NumberFormat object as specified
            in the comment.
        4) Add the statement to declare fmt to be a DecimalFormat object as specified
            in the comment.
        5) Add the statements to print a label in the following format (the numbers
            in the example output are correct for input of $4.25 per pound and 41 ounces).
            Use the formatting object money to print the unit price and total price and
            the formatting object fmt to print the weight to 2 decimal places.
 */
public class Deli
{
    public static void main (String[] args)
    {
        final double OUNCES_PER_POUND = 16.0;
        double pricePerPound, weightOunces, weightPounds, totalPrice;
        Scanner scan = new Scanner(System.in);

        NumberFormat money = NumberFormat.getCurrencyInstance();
        String pattern = "###,###.##";
        DecimalFormat fmt = new DecimalFormat(pattern);

        // String formattedMoney = money.format(23.563);

        // String format = fmt.format(4569.1251);

        System.out.println ("Welcome to the CS Deli!!\n ");

        System.out.print ("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();

        System.out.print ("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();
        weightPounds = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weightPounds;



        String strPricePerPound = money.format(pricePerPound);
        System.out.println("\nUnit Price: " + strPricePerPound + " per pound");
        String strWeight = fmt.format(weightPounds);
        System.out.println("Weight: " + strWeight + " pounds");
        String strTotal = money.format(totalPrice);
        System.out.println("TOTAL: " + strTotal);

    }
}
