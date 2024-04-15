import java.util.*;
class stack1
{
    private Vector<y> v=new Vector<>();
    public void push(y obj)
    {
        v.addElement(obj);
    }
    public y pop()
    {
        y obj=null;
        obj=v.lastElement();
        v.remove(v.size()-1);
        return obj;
    }
    public boolean empty()
    {
        if(v.size()==0)
        return true;
        else 
        return false;
    }
public static void main (String args[])
{
   Stack<Integer>s=new Stack<Integer>();
   s.push(34);
   s.push(638);
   while(!s.empty())
   {
    System.out.println(s.pop());
   } 
}
}