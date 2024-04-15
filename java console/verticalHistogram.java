import java.io.*;
class verticalHistogram
{
    public static void main(String[] args)
    {
        Console con=System.console();
        int arr[]=new int[10];
        int i,j,max,m;
        System.out.println("enter the elements:");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(con.readLine());
        }
        max=arr[0];
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        m=max;
        for(i=0;i<m;i++)
        {
            for(j=0;j<arr.length;j++)
                if(arr[j]<max)
                System.out.print(" ");
                else
                System.out.print("*");
                max--;
                System.out.println();
        }
    }
}
