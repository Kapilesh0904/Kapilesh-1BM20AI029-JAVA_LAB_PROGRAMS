abstract class Marks
{
    abstract void getPercentage();
}

class A1 extends Marks
{
    double m1,m2,m3;
    A1(double mark1,double mark2,double mark3)
    {
        this.m1 = mark1;
        this.m2 = mark2;
        this.m3 = mark3;
    }
    void getPercentage()
    {
        double perc = (m1 + m2 + m3)/3.0;
        System.out.println("Percentage of A : " + perc);
    }
}

class B1 extends Marks
{
    double m1,m2,m3,m4;
    B1(double mark1,double mark2,double mark3,double mark4)
    {
        this.m1 = mark1;
        this.m2 = mark2;
        this.m3 = mark3;
        this.m4 = mark4;
    }
    void getPercentage()
    {
        double perc = (m1 + m2 + m3 + m4)/4.0;
        System.out.println("Percentage of B : " + perc);
    }
}

public class Assignment3 
{
    public static void main(String args[])
    {
        A1 obj1 = new A1(66.7,89.5,78.3);
        obj1.getPercentage();
        B1 obj2 = new B1(95.6,78.5,96.3,91.4);
        obj2.getPercentage();
    }   
}
