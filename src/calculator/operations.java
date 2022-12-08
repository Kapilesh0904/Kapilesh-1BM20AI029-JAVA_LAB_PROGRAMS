package calculator;
import java.lang.Math;
public class operations
{
    public int n1,n2;
    public operations(int num1,int num2)
    {
        this.n1 = num1;
        this.n2 = num2;
    }
    public int addition()
    {
        return n1 + n2;
    }
    public int difference()
    {
        return Math.abs(n1 - n2);
    }
    public int multiply()
    {
        return n1 * n2;
    }
    public double divide()
    {
        return (double)(n1)/(double)(n2);
    }
}