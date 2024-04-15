import java.io.*;
class Item
{
    public static void main(String args[])
    {
        Console con=System.console();
        library a;
        library arr[]=new library[2];
        for(int i=0;i<2;i++)
        {
            System.out.print("enter book or dvd:");
            String c=con.readLine();
            if(c.charAt(0)=='b')
            {
                a=new Book();
                a.read();
                arr[i]=a;
            }
            else
            {
                a=new Dvd();
                a.read();
                arr[i]=a;
            }
        }
        System.out.println("the list is:");
        for(int i=0;i<2;i++)
        {
            arr[i].show();
        }
            
    }
}
