import java.io.*;
class consolesum 
{
    public static void main(String[] args)
    {
        Console con=System.console();
        int a,b,sum=0;
        System.out.print("enter two values:");
        a=Integer.parseInt(con.readLine());
        b=Integer.parseInt(con.readLine());
        sum=a+b;
        System.out.println("Sum is:"+sum);


    }
}
