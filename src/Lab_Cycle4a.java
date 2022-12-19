import Package1.*;
import Package2.*;

public class Lab_Cycle4a {
    public static void main(String args[])
    {
        GCD obj1 = new GCD();
        System.out.println("GCD = " +obj1.calcGCD(32, 52));
        LCM obj2 = new LCM();
        System.out.println("LCM = " +obj2.getlcm(32, 52));
    }
}
