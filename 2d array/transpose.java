import java.io.*;
class transpose
{
    public static void main(String[] args)
    {
        Console con=System.console();
        int row,column;
        System.out.print("enter row and column:");
        row=Integer.parseInt(con.readLine());
        column=Integer.parseInt(con.readLine());
        int a[][]=new int[row][column];
        int transpose[][]=new int[column][row];
        int i,j;
        System.out.print("enter the elements");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                a[i][j]=Integer.parseInt(con.readLine());
            }
        }
        System.out.println("matrix is:");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        } 
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                transpose[j][i]=a[i][j];
            }
        }
        System.out.println("transpose matrix is:");
        for(i=0;i<transpose.length;i++)
        {
            for(j=0;j<transpose[i].length;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}