import java.util.Scanner;
public class Fractions {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Numerator: ");
        int numerator = scan.nextInt();
        System.out.print("Enter Denominator: ");
        int denominator = scan.nextInt();

        double decFraction = (double) numerator/denominator;
        System.out.println("Decimal Equivalent: " + decFraction);
    }
}
