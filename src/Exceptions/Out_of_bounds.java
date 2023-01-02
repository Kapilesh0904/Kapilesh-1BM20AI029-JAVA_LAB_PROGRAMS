package Exceptions;
import java.util.Scanner;

public class Out_of_bounds {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,pos;
        System.out.println("Enter a number :");
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter a element : ");
            a[i] = sc.nextInt();
        }
        try {
            System.out.println("Enter a position");
            pos = sc.nextInt();
            System.out.println("Value = " + a[pos]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds Exception");
        }
        sc.close();
    }
}
