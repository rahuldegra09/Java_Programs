import java.util.regex.*;
class regex 
{
    private static String regex="a*b";
    private static String input="aabfooaabfooabfooxyz";
    private static String replace="-";
public static void main(String args[])
{
    Pattern p=Pattern.compile("regex");
    Matcher m=p.matcher("input");
    StringBuffer sb=new StringBuffer();
    while(m.find())
    {
        m.appendReplacement(sb,replace);
    }
    m.appendTail(sb);
    System.out.println(sb);rr

}
}