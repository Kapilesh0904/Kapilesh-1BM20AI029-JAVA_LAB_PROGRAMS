package LAB_CIE2_Practice;

import java.util.*;

class InvalidProductException extends Exception
{
    InvalidProductException(String msg)
    {
        super(msg);
    }
}

public class Product {
    String Manufacturer;
    int weight;
    Product(String m,int w) throws InvalidProductException
    {
        if( !m.equals("BMS") && w > 100)
            throw new InvalidProductException("Invalid Product");
        else
        {
            Manufacturer = m;
            weight = w;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Manufacturer :");
        String m = sc.next();
        System.out.println("Enter Weight :");
        int w = sc.nextInt();
        sc.close();
        try
        {
            Product obj = new Product(m, w);
            System.out.println("Manufacturer = " + obj.Manufacturer);
            System.out.println("Weight = " + obj.weight);
        }
        catch(InvalidProductException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
