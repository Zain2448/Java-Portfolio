public class BasketballStats extends PlayerStats
{
    BasketballStats (String name, int age, String position)
    {
        super(name, age, position);
    }

    public String toString()
    {

        return "\nBasketball Player Stats:\n" + super.toString();
    }

    @Override
    void allPositions()
    {
        System.out.println("\nPositions: Center, Power Forward, Small Forward, Point Guard, Shooting Guard.");
    }
}
