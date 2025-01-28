import java.util.Scanner;
public class SquareCalculations {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Square Length: ");
        double length = scan.nextDouble();

        double perimeter = length * 4, area = Math.pow(length, 2);

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        /*
        Write an application that prompts for and reads integer representing the
        length of a square’s side, then prints the square’s perimeter and area.
         */
    }
}
