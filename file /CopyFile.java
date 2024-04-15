import java.io.*;
class CopyFile
{
    public static void main(String args[])throws IOException
    {
        System.out.print(args.length);
        for(int i=0;i<args.length-1;i++)
        {
        File f=new File(args[i]);
        if(!f.exists())
        {
            System.out.print("source file not exists");
            System.exit(0);
        }
        FileInputStream fis=new FileInputStream(args[i]);
        FileOutputStream fos=new FileOutputStream(args[(args.length-1)],true);
        int ch;
        while((ch=fis.read())!=-1)
        {
            fos.write(ch);
        }
        fis.close();
        fos.close();
    }
    }
}