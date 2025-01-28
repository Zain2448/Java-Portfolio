public class CricketStats extends PlayerStats
{

    CricketStats(String name, int age, String position)
    {
        super(name, age, position);
    }

    public String toString()
    {

        return "\nCricketer Stats:\n" + super.toString();
    }

    @Override
    void allPositions()
    {
        System.out.println("\nPositions: Bowler, Wicket Keeper, Fielder, Batter");
    }
}
