import java.util.Scanner;
import java.util.Random;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Rock {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        //Player Play
        System.out.print("Choose R, P or S (Rock, Paper, Scissors): ");
        String personPlay = toUpperCase(scan.nextLine());

        // Computer Play
        int computerInt = random.nextInt(2);
        String[] choices = {"R", "P" , "S"};
        String computerPlay = choices[computerInt];

        //Winner
        System.out.println("My: " + personPlay);
        System.out.println("Comp: " + computerPlay);

        if (personPlay.equals(computerPlay))
        {
            System.out.println("It's a tie!");
        }
        else if (personPlay.equals("R"))
        {
            if (computerPlay.equals("P"))
            {
                System.out.println("Paper beats Rock. You Lose!!");
            }
            else
            {
                System.out.println("Rock beats Scissors. You Win!!");
            }
        }
        else if (personPlay.equals("P"))
        {
            if (computerPlay.equals("S"))
            {
                System.out.println("Scissors beats Paper. You Lose!!");
            }
            else
            {
                System.out.println("Paper beats Rocks. You Win!!");
            }
        }
        else if (personPlay.equals("S"))
        {
            if (computerPlay.equals("R"))
            {
                System.out.println("Rock beats scissors. You Lose!!");
            }
            else
            {
                System.out.println("Scissors beats paper. You Win!!");
            }
        }
        else
        {
            System.out.println("You didn't enter R, P or S.");
        }
    }
}
