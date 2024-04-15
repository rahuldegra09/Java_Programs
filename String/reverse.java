import java.io.*;

class reverse
 {
    public static void main(String args[]) 
    {
        Console con = System.console();
        String str,s1;
        System.out.print("enter the word to be pattern:");
        str = con.readLine();
        s1=str;
        do{
            s1=s1.substring(1,s1.length())+s1.substring(0,1);
            System.out.println(s1);
            
        }while(!str.equals(s1));
    }
}
     
