import java.io.*;

class merge {
    public static void main(String args[]) throws IOException {
        Console con = System.console();
        System.out.print("Enter the file name to be retreive:");
        String str = con.readLine();
        File d= new File(str);
        boolean bool=true;
        if (d.exists()) {
            System.out.print("source file already  exists");
            System.exit(0);
        }
        int j=0;
        while(bool)
        {
            File f=new File(j+".part."+str);
            if (f.exists()) {
                
            FileInputStream fis = new FileInputStream(f);
            FileOutputStream fos = new FileOutputStream(str,true);
            int ch;
            while((ch=fis.read())!=-1)
            {
                fos.write(ch);
            }
            fis.close();
            fos.close();
            j++;
        }
        else 
        bool=false;
    }
        System.out.println("succcesful---------");
        }
}