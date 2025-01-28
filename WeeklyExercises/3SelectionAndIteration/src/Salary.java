import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.exit;

public class Salary
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Current Salary: ");
        double salary = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter Performance Rating (Excellent, Good, or Poor): ");
        String rating = scan.nextLine();
        
        double raise = 0;
        if (Objects.equals(rating, "excellent"))
        {
            raise = salary * 0.06;
        }
        else if (Objects.equals(rating, "good"))
        {
            raise = salary * 0.04;
        }
        else if (Objects.equals(rating, "poor"))
        {
            raise = salary * 0.015;
        }
        else
        {
            System.out.println("Enter in a valid rating");
            exit(0);
        }

        double newSalary = salary + raise;
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        System.out.println("Current Salary:       $" + formatter.format(salary) +
                "\nAmount of your raise: $" + formatter.format(raise) +
                "\nYour new salary:      $" + formatter.format(newSalary));
    }
}
