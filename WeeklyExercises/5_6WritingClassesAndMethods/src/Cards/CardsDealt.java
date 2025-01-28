package Cards;
import java.util.Random;

public class CardsDealt
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        String[] suits = {"Diamonds", "Spades", "Clubs", "Hearts"};
        String[] faceValue = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int[] randSuit =  new int[5];
        for (int i = 0; i < 5; i++)
        {
            randSuit[i] = rand.nextInt(4);
        }

        int[] randValue = new int[5];
        for (int i = 0; i < 5; i++)
        {
            randValue[i] = rand.nextInt(13);
        }

        Card card1 = new Card(suits[randSuit[0]], faceValue[randValue[0]]);
        Card card2 = new Card(suits[randSuit[1]], faceValue[randValue[1]]);
        Card card3 = new Card(suits[randSuit[2]], faceValue[randValue[2]]);
        Card card4 = new Card(suits[randSuit[3]], faceValue[randValue[3]]);
        Card card5 = new Card(suits[randSuit[4]], faceValue[randValue[4]]);

        Card[] cards = {card1, card2, card3, card4, card5};

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Card " + (i + 1) + ": ");
            System.out.println(cards[i]);
        }

    }
}
