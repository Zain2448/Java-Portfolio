package Bulb;

public class Bulb
{
    private boolean state;

    Bulb(boolean state)
    {
        setState(state);
    }

    public boolean getState()
    {
        return state;
    }

    public void setState(boolean state)
    {
        this.state = state;
    }

    public String toString()
    {
        if (state)
        {
            return "Bulb is on.";
        }
        else
        {
            return "Bulb is off.";
        }
    }
    /*
    Design and implement a class called Bulb that represents a light bulb that can be turned on and off.
        Create a driver class called Lights, whose main method instantiates and turns on some Bulb objects
     */
}
