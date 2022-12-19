package Package2;
import Package1.*;
public class LCM {
    public int getlcm(int n1, int n2)
    {
        GCD obj = new GCD();
        return (n1 / obj.calcGCD(n1, n2)) * n2;
    }
}
