import java.io.*;
class histogram
{
    public static void main(String[] args)
    {
        Console con=System.console();
        int arr[]=new int[10];
        int i,j;
        System.out.print("enter the array:");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(con.readLine());
        }
        for(i=0;i<arr.length;i++)
        {
           
            for(j=0;j<arr[i];j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}