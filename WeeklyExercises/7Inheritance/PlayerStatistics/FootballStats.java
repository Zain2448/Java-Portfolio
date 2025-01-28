public class FootballStats extends PlayerStats
{
    FootballStats(String name, int age, String position)
    {
        super(name, age, position);
    }

    public String toString()
    {

        return "\nFootballer Stats:\n" + super.toString();
    }

    @Override
    void allPositions()
    {
        System.out.println("\nPositions: Strikers, Midfielders, Defenders, Goalkeeper.");
    }
}
