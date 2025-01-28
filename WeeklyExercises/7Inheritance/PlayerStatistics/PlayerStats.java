public abstract class PlayerStats
{
    String name;
    int age;
    String position;

    PlayerStats(String name, int age, String position)
    {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String toString()
    {
        return  "\tName: " + name +
                "\n\tAge: " + age +
                "\n\tPosition: " + position;
    }

    abstract void allPositions();
}
