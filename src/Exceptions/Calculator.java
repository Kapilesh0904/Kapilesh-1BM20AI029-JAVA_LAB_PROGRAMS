package Exceptions;
import java.util.*;

public class Calculator 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,res,choice;
        System.out.println("******** Operations ********");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice :");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Enter two numbers :");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    res = a + b;
                    System.out.println("Result = " + res);
                    break;
            case 2: System.out.println("Enter two numbers :");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    res = a - b;
                    System.out.println("Result = " + res);
                    break;
            case 3: System.out.println("Enter two numbers :");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    res = a * b;
                    System.out.println("Result = " + res);
                    break;
            case 4: System.out.println("Enter two numbers :");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    try{
                        res = a/b;
                        System.out.println("Result = " + res);
                    }
                    catch(ArithmeticException e){
                        System.out.println("b value = 0");
                    }
                    break;
            default:System.out.println("Invalid case");
        }
        sc.close();
    }
}
