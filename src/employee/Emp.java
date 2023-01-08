package employee;

public class Emp 
{
    public String name,category;
    public int id;
    public double bpay,hra,da,npay,pf,grosspay,incometax,allowance;
    public Emp(String name,String cat,int id,double bpay,double allowance)
    {
        this.name = name;
        this.category = cat;
        this.id = id;
        this.bpay = bpay;
        this.allowance = allowance;
    }
    public void calculate()
    {
        hra = bpay * 0.1;
        da = bpay * 0.05;
        pf = bpay * 0.12;
        grosspay = bpay + hra + da - pf;
        incometax = 0.3 * grosspay;
        npay = grosspay + allowance - incometax;
    }
    public void display()
    {
        System.out.println("Name = " + name);
        System.out.println("Category = " + category);
        System.out.println("ID = " + id);
        System.out.println("Basic Pay = " + bpay);
        System.out.println("Allowance = " + allowance);
        System.out.println("Gross Pay = " + grosspay);
        System.out.println("Income Tax = " + incometax);
        System.out.println("Net Pay = " + npay);
    }
}