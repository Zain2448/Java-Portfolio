import java.util.ArrayList;
import java.util.Random;

public class Histogram
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNum;
        ArrayList <Integer> numArrayList = new ArrayList<>();

        for (int i = 0; i < 25; i++)
        {
            randomNum = random.nextInt(100) + 1;
            System.out.print(randomNum + " ");
            numArrayList.add(randomNum);
        }

        System.out.println();

        int lowerBound = 1;
        int upperBound = 10;

        System.out.println();
        for (int i = 0; i < 10; i ++)
        {
            System.out.print(lowerBound + " to " + upperBound + " \t| ");
            for (int num: numArrayList)
            {
                if (num >= lowerBound && num <= upperBound)
                {
                    System.out.print("*");
                }
            }

            lowerBound += 10;
            upperBound += 10;
            System.out.println();
        }

    }
}
