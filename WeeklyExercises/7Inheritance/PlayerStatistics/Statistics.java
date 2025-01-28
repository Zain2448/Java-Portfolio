public class Statistics
{
    public static void main(String[] args)
    {
        FootballStats footballer1 = new FootballStats("Zain", 19, "Defender");
        System.out.println(footballer1);
        footballer1.allPositions();

        CricketStats cricketer1 = new CricketStats("Bob", 35, "Batter");
        System.out.println(cricketer1);
        cricketer1.allPositions();

        BasketballStats bbPlayer1 = new BasketballStats("John", 24, "Center");
        System.out.println(bbPlayer1);
        bbPlayer1.allPositions();
    }
}
