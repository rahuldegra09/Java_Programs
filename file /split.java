import java.io.*;
class split{
    public static void main(String args[])throws IOException
    {
        Console con=System.console();
        System.out.print("Enter the file name:");
        String str=con.readLine();
        File f=new File(str);
        if(!f.exists())
        {
            System.out.print("file not found");
            System.exit(0);
        }
        FileInputStream fis=new FileInputStream(f);
        System.out.print("size in kb:"+f.length());
        if((f.length())<=0)
        {
            System.out.print("Size is null");
            System.exit(0);
        }
        System.out.print("\nenter the size for destination file:");
        int size = Integer.parseInt(con.readLine());
        int parts=((int)(f.length()/size));
        if((f.length()%size>0))
        {
            parts++;
        }      
        File fparts[]=new File[parts];
        for(int i=0;i< fparts.length;i++)
        {
            fparts[i]=new File(i+".part."+f.getPath());
            FileOutputStream fos=new FileOutputStream(fparts[i]);
            int ch=1;
           for(int j=0;j<size&&ch!=-1;j++)
            {
                ch=fis.read();
                fos.write(ch);
            }
            fos.close();
        }
        fis.close();
    }
}