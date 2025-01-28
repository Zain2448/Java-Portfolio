package Bulb;

public class Lights
{
    public static void main(String[] args)
    {
        Bulb bulb1 = new Bulb(true);
        Bulb bulb2 = new Bulb(false);
        Bulb bulb3 = new Bulb(true);

        System.out.println(bulb3.getState());
        bulb3.setState(false);
        System.out.println(bulb3.getState());

        System.out.println(bulb1);
        System.out.println(bulb2);
        System.out.println(bulb3);
    }
}
