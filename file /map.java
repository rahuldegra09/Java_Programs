import java.io.*;
import java.util.*;
class map
{
    public static void main(String args[])throws IOException
    {
        Console con=System.console();
        int count;
        System.out.print("enter the file name:");
        String str=con.readLine();
        File f=new File(str);
        if(!f.exists())
        {
            System.out.println("file not found");
            System.exit(0);
        }
        HashMap<String,Integer> m1=new HashMap <String,Integer>();
        FileInputStream fis=new FileInputStream(f);
        StreamTokenizer st = new StreamTokenizer(fis);
     while (st.nextToken() != StreamTokenizer.TT_EOF)
     {
    
         if(m1.containsKey(st.sval))
         {
             count=(int)m1.get(st.sval);
             count++;
             m1.put(st.sval,count);
         }
         else            
             m1.put(st.sval,1);
            }
            
        }
        for(Stringvalue)
}