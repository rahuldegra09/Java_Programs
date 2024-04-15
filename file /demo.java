import java.io.*;
import java.util.*;
class demo{
    public static void main(String args[])throws IOException
    {
        Console con=System.console();
        System.out.print("enter the post fix expresion:");
         String str;
         char arr[];
        str=con.readLine();
        arr=str.toCharArray();
        Stack st=new Stack();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>47&&arr[i]<58)
            {
            st.push(arr[i]);
            }
        else 
            {
                 int a=Integer.parseInt(String.valueOf(st.pop()));
                 int b= Integer.parseInt(String.valueOf(st.pop()));
                 switch(arr[i])
                {
                    case '+':st.push(a+b);
                                break;
                    case'-':st.push(b-a);
                                break;
                    case '/':
                            st.push(b/a);
                                break;
                    case '*':
                            st.push(b * a);
                                break;           
             }
        }
        }
        System.out.println(st.pop());
}
}