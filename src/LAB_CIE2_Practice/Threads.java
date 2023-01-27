package LAB_CIE2_Practice;

import java.util.*;

class Square implements Runnable
{
    int x;
    Square(int x)
    {
        this.x = x;
    }
    public void run()
    {
        System.out.println("Inside Square Thread");
        System.out.println("Square of " + x + " = " + (x*x));
    }
}

class Cube implements Runnable
{
    int x;
    Cube(int x)
    {
        this.x = x;
    }
    public void run()
    {
        System.out.println("Inside Cube Thread");
        System.out.println("Cube of " + x + " = " + (x*x*x));
    }
}

class RandomNumber implements Runnable
{
    Random r;
    Thread t2,t3;
    public void run()
    {
        int num;
        r = new Random();
        try{
            while(true)
            {
                num = r.nextInt(100);
                System.out.println("Main Thread and Generated Number = " + num);
                if (num%2 == 0)
                {
                    t2 = new Thread(new Square(num));
                    t2.start();
                }
                else
                {
                    t3 = new Thread(new Cube(num));
                    t3.start();
                }
                Thread.sleep(1000);
                System.out.println();
            }
        }
        catch(Exception e)
        {
            System.out.println("Interrupted Exception");
        }
    }
}

public class Threads {
    public static void main(String args[])
    {
        RandomNumber obj = new RandomNumber();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
