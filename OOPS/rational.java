import java.io.*;
class rational
{
    private int numerator;
    private int denominator;
    public rational()
    {
        Console con=System.console();
        System.out.println("enter numerator");
        numerator=Integer.parseInt(con.readLine());
        System.out.println("enter denominator");
        denominator= Integer.parseInt(con.readLine());
    }
    public  rational(int n,int d)
    {
        this.numerator=n;
        this.denominator=d;
    }
    public rational(rational m)
    {
        this.numerator=m.numerator;
        this.denominator=m.denominator;
    }
    public void show()
    {
        if(denominator!=0)
        System.out.println(numerator+"/"+denominator);
        else 
        System.out.println("infinite");
        
    }
    public rational add (rational m)
    {
        rational temp=new rational(0,0);
        temp.numerator=(numerator*m.denominator)+(m.numerator*denominator);
        temp.denominator=(denominator*m.denominator);
        return temp;
    }
    public rational sub (rational m)
    {
        rational temp=new rational(0,0);
        temp.numerator=(numerator * m.denominator)-(m.numerator * denominator);
        temp.denominator = (denominator * m.denominator);
        return temp;
    }
    public rational multiple (rational m)
    {
        rational temp = new rational(0, 0);
        temp.numerator = (numerator *m.numerator) ;
        temp.denominator = (denominator * m.denominator);
        return temp;
    }
    public rational division (rational m)
    {
        rational temp = new rational(0, 0);
        temp.numerator = (numerator * m.denominator);
        temp.denominator = (denominator * m.numerator);
        return temp;
     
    }
}
