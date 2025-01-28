import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Dice {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many sides does die 1 have? ");
        int dice1 = scan.nextInt();
        scan.nextLine();
        System.out.print("How many sides does die 2 have? ");
        int dice2 = scan.nextInt();

        String[] rollNum = {"first", "second","third"};
        ArrayList<Integer> die1Scores = new ArrayList<Integer>();
        ArrayList<Integer> die2Scores = new ArrayList<Integer>();

        for(int i = 0; i < 3; i++)
        {
            int dice1Roll = random.nextInt(dice1);
            die1Scores.add(dice1Roll);
            System.out.println("Die 1 " + rollNum[i] + " roll = " + dice1Roll + ".");
            int dice2Roll = random.nextInt(dice2);
            die2Scores.add(dice2Roll);
            System.out.println("Die 2 " + rollNum[i] + " roll = " + dice2Roll + ".");
        }

        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < 3; i++)
        {
            sum1 += die1Scores.get(i);
            sum2 += die2Scores.get(i);
        }

        System.out.println("Die 1 rolled a total of " + sum1 + " and rolled " + (double) sum1/3+ " on average.");
        System.out.println("Die 2 rolled a total of " + sum2 + " and rolled " + (double) sum2/3 + " on average.");


    }
}
