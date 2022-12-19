import Cube.*;
import Square.*;
import java.lang.Math;

abstract class Nums
{
    int number;
    abstract void random();
}

public class Lab_Cycle4c extends Nums {
    void random()
    {
        int max = 100, min = 1;
        number = (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String args[])
    {
        Lab_Cycle4c obj = new Lab_Cycle4c();
        square o1 = new square();
        cube o2 = new cube();
        for (int i = 1;i<=10;i++)
        {
            obj.random();
            System.out.println("Square of " + obj.number + " = " + o1.getSquare(obj.number));
            System.out.println("Cube of " + obj.number + " = " + o2.getCube(obj.number));
        }
    }
}
