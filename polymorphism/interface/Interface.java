import java.io.*;
interface library
{
    void read();
    void show();
}
class Book implements library
{
String str, ath, pub;
public void read()
    {   
        Console con = System.console();
        System.out.print("enter the book title:");
        str=con.readLine();
        System.out.print("enter the author name :");
        ath = con.readLine();
        System.out.print("enter the publication:");
        pub= con.readLine();
    }
public void show()
    {
      System.out.println("book :"+str+"-"+"author :"+ath+"-"+"publication :"+pub);
    }
}
class Dvd implements library{
    String tit, name, cat;
    public void read()
        {
            Console con = System.console();
            System.out.print("enter the movie title:");
            tit = con.readLine();
            System.out.print("enter the director name :");
            name = con.readLine();
            System.out.print("enter the category :");
            cat = con.readLine();
        }
        
    public void show() 
        {
            System.out.println("DVD :"+tit+"-"+"author :"+name+"-"+"publication :"+cat);
        }
    }