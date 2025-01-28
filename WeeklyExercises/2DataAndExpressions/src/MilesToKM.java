import java.util.Scanner;
public class MilesToKM {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of miles: ");
        double miles = scan.nextDouble();

        double km = (miles *  1.60935);
        System.out.println(miles + " Miles = " + km + " Kilometres");

        /*
        Write an application that converts miles to kilometers.(One mile equals 1.60935 km).
        Read the miles from the user as a floating point value.
         */
    }
}
