package Package1;

public class GCD {
    public int calcGCD(int n1, int n2)
    {
        if (n2 != 0)
            return calcGCD(n2,n1%n2);
        else
            return n1;
    }
}