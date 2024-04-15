import java.io.*;
class vowelsconsonant 
{
    public static void main(String args[])
    {
        Console con=System.console();
        String str;
        System.out.print("enter the sentence:");
        str=con.readLine();
        str=str.toLowerCase();
        int i, count=0,c=0;
        char ch;
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
        if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
        count++;
        else if((ch>='a')&&(ch<='z'))
            c++;
        }
        System.out.println("no of vowels is:"+count);
        System.out.println("no of consonant is:"+c);

        
    }    
}
