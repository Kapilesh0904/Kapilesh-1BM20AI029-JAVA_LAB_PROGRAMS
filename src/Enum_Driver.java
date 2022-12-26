enum size{Regular,Medium,Large}

class Test
{
    size s;
    Test(size s)
    {
        this.s = s;
    }
    void order_pizza()
    {
        switch(s)
        {
            case Regular:System.out.println("You ordered Regular Pizza");
                         break;
            case Medium :System.out.println("You ordered Medium Pizza");
                         break;
            case Large  :System.out.println("You ordered Large Pizza");
                         break;
            default     :System.out.println("Invalid Size");
        }
    }
}

public class Enum_Driver {
    public static void main(String args[])
    {
        for (size s : size.values())
        {
            Test obj = new Test(s);
            obj.order_pizza();
            System.out.println();
        }
    }
}
