abstract class Animal
{
    protected int legs;
    Animal(){}
    protected Animal(int number)
    {
        this.legs = number;
    }
    abstract void eat();
    void walks()
    {
        System.out.println("This Animal walks with " + legs + " legs");
    }
}

class Spider extends Animal
{
    Spider()
    {
        super(8);
    }
    void eat()
    {
        System.out.println("Spider eats many insects");
    }
}

interface Pet 
{
    public String getName();
    public void setName(String name);
    public void play();
}

class Cat extends Animal implements Pet
{
    String name;
    Cat(String n)
    {
        super(4);
        name = n;
    }
    Cat()
    {
        this("");
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void play()
    {
        System.out.println("The cat plays with a ball");
    }
    void eat()
    {
        System.out.println("This cat eats cat food");
    }
}

class fish extends Animal implements Pet
{
    String name;
    fish()
    {
        super(0);
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void play()
    {
        System.out.println("This fish doesn't play");
    }
    void walks()
    {
        System.out.println("Fish doesnt have legs");
    }
    void eat()
    {
        System.out.println("This fish eats fish food");
    }
}

public class Assignment4 
{
    public static void main(String args[])
    {
        fish d = new fish();
        Cat c = new Cat("Fluffy");
        Animal a = new fish();
        Animal e = new Spider();
        Pet p = new Cat();
        d.setName("Nemo");
        System.out.println("\nName of fish : " + d.getName());
        d.play();
        d.walks();
        d.eat();
        System.out.println("\nName of Cat : " + c.getName());
        c.eat();
        c.play();
        c.walks();
        a.walks();
        a.eat();
        e.eat();
        e.walks();
        p.play();  
    }
}
