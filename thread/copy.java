import java.io.*;
import java.util.*;
public class copy  extends Thread{
    public Vector v = new Vector();
    int i=1;
    public File folder = new File("/Users/rahuldegra/Desktop/copy/");
    public File[] listOfFiles=folder.listFiles();
    synchronized public  void readFile()
    {
        if (Thread.currentThread().getName().contains("Reader"))
        {
            try{
                File folder = new File("/Users/rahuldegra/Desktop/copy");
                File[] listOfFiles = folder.listFiles();
                    System.out.println("I am copy content from file....");
                    BufferedReader bf = new BufferedReader(new FileReader(listOfFiles[i]));
                String line = bf.readLine();
                while (line != null) 
                {
                    v.add(line);
                    line = bf.readLine();
                }
                    bf.close();
                    System.out.println("Now you can write content to another files...");
                }
            catch (FileNotFoundException ex) 
            {
                System.out.println("Unable to open file '"+ "file[i]" + "'");
            } 
            catch (IOException ex)
            {
                 System.out.println("Error reading file '"+ "file[i]"+ "'");
            }
         }
    }
synchronized public void writefile() 
    {  
         if (Thread.currentThread().getName().contains("writer")) 
            {
            try
            {   
                    System.out.println("I am copy content to file....");
                    File file = new File(folder.getPath()+i);
                    FileWriter fileReader = new FileWriter(file); 
                    BufferedWriter bufferedWriter = new BufferedWriter(fileReader); 
                    Iterator iter=v.iterator();
                    while(iter.hasNext())
                    {
                        bufferedWriter.write((String)iter.next());
                    }
                    bufferedWriter.close ();
                    System.out.println("Now you can read content from files...");
                    i++;
                }
                catch(IOException e)
                {
                    System.out.println("Error writing to file '" + "file" + "'");
                }
            }
    }
    public void run()
    {
        for(int j=1;j<listOfFiles.length;j++)
        {
            if (Thread.currentThread().getName().contains("Reader"))
            {
         readFile();
            }
            else if (Thread.currentThread().getName().contains("writer")){
         writefile();
    }
}
    }
public static void main(String args[])
{
    copy c=new copy();
    Thread t1=new Thread(c);
    Thread t2 = new Thread(c);
    t1.setName("Reader");
    t2.setName("writer");
     t1.start();
     t2.start();
}}