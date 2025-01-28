package Sphere;

public class Sphere
{
    private double diameter;

    Sphere(double diameter)
    {
        setDiameter(diameter);
    }

    public double getDiameter()
    {
        return diameter;
    }

    public void setDiameter(double diameter)
    {
        this.diameter = diameter;
    }

    public String toString()
    {
        return "Diameter: " + diameter;
    }

    public String Volume ()
    {
        double volume =  (double) 4 /3 * Math.PI * Math.pow(diameter/2, 3);
        return "Volume: " + volume;
    }

    public String SurfaceArea ()
    {
        double SA =  4 * Math.PI * Math.pow(diameter/2, 2);
        return "Surface Area: " + SA;
    }

    /*
-   Include getter and setter methods for the diameter.

-   Include methods to calculate and return the volume and surface area of the sphere.

-   Include a toString method that returns a one-line description of the sphere.

-   Create a driver class (main class) called Sphere.MultiSphere, whose main method
    instantiates and updates several Sphere.Sphere objects.
     */
}
