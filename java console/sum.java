import java.io.Console;
class sum
{
    public static void main (String[] args)
    {
        Console con=System.console();
        int a,b,sum;
        System.out.print("enter the first no:");
        a=Integer.parseInt(con.readLine());
        System.out.print("enter the second no:");
        b=Integer.parseInt(con.readLine());
        sum=a+b;
        System.out.print("toal is: "+sum);


    }
}