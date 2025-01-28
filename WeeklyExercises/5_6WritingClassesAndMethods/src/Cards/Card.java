package Cards;

public class Card
{

    String suit;
    String value;

    Card(String suit, String value)
    {
        this.suit = suit;
        this.value = value;
    }

    public String toString()
    {
        return "\tSuits: " + suit + "\n\tValue: " + value + "\n";
    }
    /*
        Design and implement a class called Card that represents a standard playing card.
        Each card has a suit and a face value. Create a program that deals five random cards.
    */
}
