import java.io.*;
class palindrome 
{
    public static void main(String args[])  
    {
        Console con=System.console();
        String str,rev="";
        System.out.print("enter the string:");
        str=con.readLine();
        int length=str.length();
        int i;
        for(i=length-1;i>0;i--)
            {
                rev=rev+str.charAt(i);
            }
        if(str.equals(rev))
            System.out.print("the entered string is palindrome");
        else    
            System.out.println("the entered string is not palindrome");
    }  
}
