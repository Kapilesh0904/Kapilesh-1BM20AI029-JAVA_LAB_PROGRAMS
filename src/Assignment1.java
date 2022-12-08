import java.lang.Math;
class Number {
    int n;
    Number(int num)
    {
        this.n = num;
    }
    boolean isZero()
    {
        if(n == 0)
            return true;
        return false;
    }
    boolean isPositive()
    {
        if (n>=0)
            return true;
        return false;
    }
    boolean isNegative()
    {
        if (n<0)
            return true;
        return false;
    }
    boolean isOdd()
    {
        if (n%2 != 0)
            return true;
        return false;
    }
    boolean isEven()
    {
        if (n%2 == 0)
            return true;
        return false;
    }
    boolean isPrime()
    {
        for(int i=2;i<=n/2;i++)
        {
            if (n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    boolean isAmstrong()
    {
        int temp, digits=0, last=0, sum=0;   
        temp=n;    
        while(temp>0)    
        {   
            temp = temp/10;   
            digits++;   
        }   
        temp = n;   
        while(temp>0)   
        {        
            last = temp % 10;   
            sum +=  (Math.pow(last, digits));   
            temp = temp/10;   
        }    
        if(n == sum)    
            return true;       
        else 
            return false;   
    }
    int factorial()
    {
        if (n < 0)
            return 0;
        if (n == 0 || n == 1)
            return 1;
        int fact = 1;
        for(int i = 2;i<=n;i++)
            fact = fact * i;
        return fact;
    }
    double getSqrt()
    {
        return Math.sqrt((double)n);
    }
    int getSqr()
    {
        return n*n;
    }
    int sumDigits()
    {
        int sum = 0,num = n;
        while(num != 0)
        {
            sum+= num%10;
            num/=10;
        }
        return sum;
    }
    int getReverse()
    {
        int num = n,rev_num = 0;
        while(num != 0)
        {
            rev_num = rev_num *10 + num%10;
            num = num/10;
        }
        return rev_num;
    }
    void listFactor()
    {
        System.out.println("Factors of " + n + " :");
        for(int i=1;i<=n/2;i++)
            if(n%i == 0)
                System.out.print(i +"\t");
        System.out.print(n + "\n");
    }
    void dispBinary()
    {
        int num = n,i=0;
        int[] binaryNum = new int[1000];
        while (num > 0) 
        {
            binaryNum[i] = num % 2;
            num = num / 2;
            i++;
        }
        System.out.print("Binary Equivalent : ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
        System.out.println();
    }
}

public class Assignment1
{
    public static void main(String args[])
    {
        Number obj = new Number(5);
        System.out.println("Number is Zero ? " + obj.isZero());
        System.out.println("Number is positive ? " + obj.isPositive());
        System.out.println("Number is negative ? " + obj.isNegative());
        System.out.println("Number is odd ? " + obj.isOdd());
        System.out.println("Number is even ? " + obj.isEven());
        System.out.println("Number is prime ? " + obj.isPrime());
        System.out.println("Number is armstrong ? " + obj.isAmstrong());
        System.out.println("Factorial : " + obj.factorial());
        System.out.println("Square Root : " + obj.getSqrt());
        System.out.println("Square : " + obj.getSqr());
        System.out.println("Sum of Digits : " + obj.sumDigits());
        System.out.println("Reverse : " + obj.getReverse());
        obj.listFactor();
        obj.dispBinary();
    }
}