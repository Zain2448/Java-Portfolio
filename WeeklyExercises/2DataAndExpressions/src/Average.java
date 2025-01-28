import java.util.Scanner;
public class Average {
    public static void main (String[] args)
    {
        double average;
        System.out.println("Please enter three integers and I will compute their average");
        Scanner scan = new Scanner(System.in) ;

        System.out.print("Enter the first value: ");
        int val1 = scan.nextInt();
        System.out.print("Enter the second value: ");
        int val2 = scan.nextInt();
        System.out.print("Enter the third value: ");
        int val3 = scan.nextInt();

        average = (double) (val1 + val2 + val3) / 3;
        System.out.println("The average is " + average);
    }
}
