package Sphere;

public class MultiSphere
{
    public static void main(String[] args)
    {
        Sphere sphere1 = new Sphere(502);
        Sphere sphere2 = new Sphere(432);
        Sphere sphere3 = new Sphere(3572);

        System.out.println(sphere1.getDiameter());
        System.out.println(sphere2.getDiameter());
        System.out.println(sphere3.getDiameter());

        sphere1.setDiameter(10);
        System.out.println(sphere1);
        System.out.println(sphere1.SurfaceArea());
        System.out.println(sphere1.Volume());
    }
}
