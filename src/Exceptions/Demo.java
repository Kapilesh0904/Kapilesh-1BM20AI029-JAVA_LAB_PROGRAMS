package Exceptions;
import java.util.*;

class exceptions
{
    int a,b;
    exceptions(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    void division()
    {
        int c;
        try{
            c = a/b;
            System.out.println("C = " + c);
        }
        catch(ArithmeticException e){
            System.out.println("b value = 0");
        }
    }
}

public class Demo {
    public static void main(String args[])
    {
        int a,b;
        System.out.println("Enter two numbers :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        exceptions obj = new exceptions(a, b);
        obj.division();
        System.out.println("Program is over"); //in older versions we would have to use finally
        sc.close();
    }
}
