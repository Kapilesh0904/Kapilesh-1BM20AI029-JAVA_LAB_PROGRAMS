package LAB_CIE2_Practice;

import java.util.*;

class prime1 implements Runnable
{
    int num;
    prime1(int n)
    {
        num = n;
    }
    public void run()
    {
        System.out.println("Inside Thread 1");
        int flag = 0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i == 0)
            {
                flag=1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

class prime2 extends Thread
{
    int num;
    prime2(int n)
    {
        num = n;
    }
    public void run()
    {
        System.out.println("Inside Thread 2");
        int flag = 0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i == 0)
            {
                flag=1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

public class Prime 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        sc.close();
        Thread t1 = new Thread(new prime1(n));
        Thread t2 = new Thread(new prime2(n));
        t1.start();
        t2.start();
    }   
}
