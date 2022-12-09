import java.lang.Math;

class Shape
{
    String name;
    Shape(){}
    String getName()
    {
        return this.name;
    }
}

interface Area
{
    public double getArea();
}

interface Volume
{
    public double getVolume();
}

class Circle extends Shape implements Area
{
    double radius;
    Circle(){}
    Circle(double rad,String n)
    {
        this.radius = rad;
        this.name = n;
    }
    public double getArea()
    {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape implements Area
{
    double side;
    Square(){}
    Square(double s,String n)
    {
        this.side = s;
        this.name = n;
    }
    public double getArea()
    {
        return side * side;
    }
}

class Cylinder extends Circle implements Volume
{
    double height;
    Cylinder(double h,double r,String n)
    {
        this.height = h;
        this.radius = r;
        this.name = n;
    }
    public double getVolume()
    {
        return (3.14 * radius * radius * height);
    }
}

class Sphere extends Circle implements Volume
{
    Sphere(double r,String n)
    {
        this.radius = r;
        this.name = n;
    }
    public double getVolume()
    {
        return (4/3) * 3.14 * Math.pow(radius,3);
    }
}

class Cube extends Square implements Volume
{
    Cube(double s,String n)
    {
        this.side = s;
        this.name = n;
    }
    public double getVolume()
    {
        return Math.pow(side,3);
    }
}

class Glome extends Sphere
{
    Glome(double r,String n)
    {
        super(r,n);
    }
    public double getVolume()
    {
        return 2 * 3.14 * 3.14 * Math.pow(2*radius,3);
    }
}

public class Assignment5 
{
    public static void main(String args[])
    {
        Circle c = new Circle(7.5,"Circle");
        System.out.println("Area of Circle = " + c.getArea());
        Square s = new Square(4.5,"Square");
        System.out.println("Area of Square = " + s.getArea());
        Cylinder c1 = new Cylinder(2.5, 3.2, "Cylinder");
        System.out.println("Volume of Cylinder = " + c1.getVolume());
        Sphere s1 = new Sphere(3.5,"Sphere");
        System.out.println("Volume of Sphere = " + s1.getVolume());
        Cube c2 = new Cube(6.5,"Cube");
        System.out.println("Volume of Cube = " + c2.getVolume());
        Glome g = new Glome(4.5,"Glome");
        System.out.println("Volume of Glome = " + g.getVolume());
    }
}
