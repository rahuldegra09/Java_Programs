import java.io.*;
import java.util.*;
class SumThread extends Thread
{
    public File folder = new File("/Users/rahuldegra/Desktop/no");
    public int i=1;
    public static int sum=0;
    synchronized public void SumFile()
        {
            File folder=new File("/Users/rahuldegra/Desktop/no");
            File[] f=folder.listFiles();
            int x=f.length;
        try
        {
            BufferedReader bf = new BufferedReader(new FileReader(f[i]));
            String line ;
            while ((line = bf.readLine()) != null)
            {
                sum+=Integer.parseInt(line);
            }
            i++;
        }
        catch (FileNotFoundException ex) 
            {
                System.out.println("Unable to open file '"+ "file[i]" + "'");
            } 
            catch (IOException ex)
            {
                 System.out.println("Error reading file '"+ "file[i]"+ "'");
            }
            System.out.println(sum);
        }
        public void run()
        {
            SumFile();
        }
public static void main (String args[])throws IOException
{
    File folder = new File("/Users/rahuldegra/Desktop/no/");
    File[] f = folder.listFiles();
    SumThread d =new SumThread();
    int x = f.length;
    for(int j=1;j<x;j++)
    {
        Thread t=new Thread(d);
        t.start();
    }
    try {
        System.out.println("I am copy content to file....");
        File file = new File(folder.getPath()+".txt");
        FileWriter fileReader = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
        String str=""+sum;
            bufferedWriter.write(str);
        bufferedWriter.close();
        System.out.println("successfull...");
    } catch (IOException e) {
        System.out.println("Error writing to file '" + "file" + "'");
    }
}
}
    