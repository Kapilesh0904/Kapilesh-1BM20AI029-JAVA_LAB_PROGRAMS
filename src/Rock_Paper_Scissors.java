enum RPC{rock,paper,scissors}

class Game
{
    RPC obj;
    Game(RPC obj)
    {
        this.obj = obj;
    }
    public void Winner(Game obj2)
    {
        RPC ob2 = obj2.obj;
        switch(obj)
        {
            case rock:
                switch(ob2)
                {
                    case rock:
                        System.out.println("No winner");
                        break;
                    case paper:
                        System.out.println("Player 2 wins");
                        break;
                    default:
                        System.out.println("Player 1 wins");
                }
                break;
            case paper:
                switch(ob2)
                {
                    case rock:
                        System.out.println("Player 1 wins");
                        break;
                    case paper:
                        System.out.println("No winner");
                        break;
                    default:
                        System.out.println("Player 2 wins");
                }
                break;
            default:
                switch(ob2)
                {
                    case rock:
                        System.out.println("Player 2 wins");
                        break;
                    case paper:
                        System.out.println("Player 1 wins");
                        break;
                    default:
                        System.out.println("No winner");
                }
                break;
        }
    }
}

public class Rock_Paper_Scissors 
{
    public static void main(String args[])
    {
        Game obj1,obj2;
        for(RPC i : RPC.values())
        {
            for(RPC j : RPC.values())
            {
                obj1 = new Game(i);
                obj2 = new Game(j);
                System.out.println("Player 1 = " + i + "\tPlayer 2 = " + j);
                obj1.Winner(obj2);
                System.out.println();
            }
        }
    }
}
