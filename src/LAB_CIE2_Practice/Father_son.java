package LAB_CIE2_Practice;

import java.util.*;

class WrongAge extends Exception
{
    WrongAge(String msg)
    {
        super(msg);
    }
}

class InvalidAge extends Exception
{
    InvalidAge(String msg)
    {
        super(msg);
    }
}

class Father 
{
    int age1;
    Father(){}
    Father(int a) throws WrongAge
    {
        if (a < 0)
        {
            throw new WrongAge("Age < 0");
        }
        else
            this.age1 = a;
    }
}

class Son extends Father
{
    int age2;
    Son(int a) throws WrongAge,InvalidAge
    {
        if(a<0)
            throw new WrongAge("Son's Age < 0");
        else if(a > this.age1)
            throw new InvalidAge("Son's age is greater than father's age");
        else
            age2 = a;
    }
}

public class Father_son 
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Father's Age : ");
            Father obj1 = new Father(sc.nextInt());
            System.out.println("Enter Son's age : ");
            Son obj2 = new Son(sc.nextInt());
            System.out.println("Father : " + obj1.age1);
            System.out.println("Son : " + obj2.age2);
            sc.close();
        }
        catch(WrongAge e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidAge e)
        {
            System.out.println(e.getMessage());
        }
    }
}
