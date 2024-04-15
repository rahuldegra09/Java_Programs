import java.io.*;
class multiplication
{
    public static void main (String[] args)
    {
        Console con=System.console();
        int row1,clm1,row2,clm2;
        System.out.print("enter row and column:");
        row1=Integer.parseInt(con.readLine());
        clm1=Integer.parseInt(con.readLine());
        System.out.println("enter row2 and column2:");
        row2=Integer.parseInt(con.readLine());
        clm2=Integer.parseInt(con.readLine());
        if(row2!=clm1)
        {
            System.out.println("not posiible");
            return;
        }
        int a[][]=new int[row1][clm1];
        int b[][]=new int[row2][clm2];
        int c[][]=new int[row1][clm2];
        int i,j,k;
        System.out.println("enter the values:");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                a[i][j]=Integer.parseInt(con.readLine());
            }
        }
        System.out.println("enter more valuse:");
        for(i=0;i<b.length;i++)
        {
            for(j=0;j<b[i].length;j++)
            {
                b[i][j]=Integer.parseInt(con.readLine());
            }
        }
        System.out.println("multiplication is:");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<clm2;j++)
            {
                for(k=0;k<clm1;k++)
                {
                c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
                System.out.println();
        }
    }
}
