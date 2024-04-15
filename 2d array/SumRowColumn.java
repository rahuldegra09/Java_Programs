import java.io.*;
class SumRowColumn
{
    public static void main(String arg[])
    {
        Console con=System.console();
        int r,c,i,j,sum=0;
        System.out.print("Enter no of row and column:");
        r=Integer.parseInt(con.readLine());
        c=Integer.parseInt(con.readLine());
        int a[][]=new int[r][c];
        System.out.println("enter the values:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=Integer.parseInt(con.readLine());
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sum+=a[i][j];
            }
            System.out.println("Sum of "+i+"row is"+"="+sum);
            sum=0;
        }
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                sum+=a[j][i];
            }
            System.out.println("Sum of "+i+"column is"+"="+sum);
            sum=0;
        }
        
    }
}