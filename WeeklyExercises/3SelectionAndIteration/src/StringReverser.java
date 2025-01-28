import java.util.Scanner;
public class StringReverser
{
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in a sentence: ");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            String[] word = words[i].split("");
            if (word.length == 1)
            {
                System.out.print(word[0]);
            }
            else
            {
                for (int j = word.length - 1; j >= 0; j--)
                {
                    System.out.print(word[j]);
                }
            }
            System.out.print(" ");
        }
    }
}

