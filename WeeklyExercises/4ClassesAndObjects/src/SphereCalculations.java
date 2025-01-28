import java.util.Scanner;
public class SphereCalculations
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double r = scan.nextDouble();

        double volume = (double) 4 * Math.PI * Math.pow(r, 3) / 3;
        double surfaceArea = (double) 4 * Math.PI * Math.pow(r, 2);

        System.out.printf("Volume: %.4f", volume);
        System.out.printf("\nSurface Area: %.4f", surfaceArea);
    }

    /*
        Write and application that reads the radius of a sphere and prints its volume and surface area.
        Use the following formulas, where r represents the radius of the sphere. Print the output to
        four decimal places.
    */
}
