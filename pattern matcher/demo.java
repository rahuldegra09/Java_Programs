import java.util.regex.*;
class demo{
    public static void main(String args[])
    {
        String line="vasu ";
        Pattern p=Pattern.compile("vasu");
        Matcher m =p.matcher(line);
        if(true)
            System.out.print("hello");
        while(m.find())
        {
            System.out.println(m.start(0)+"\t"+m.end(0)+"\t"+m.group(0));
        }

    }
}