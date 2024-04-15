import java.io.*;
class Matrix 
{
    private int arr[][]=new int[3][3];
    public void read()
    {
        Console con=System.console();
        int i,j;
        int k=0;
        for(i=0;i<arr.length;i++)
        {
            if (k==0&&k==9)
            {
                System.out.println("mewa");}
            for(j=0;j<arr[i].length;j++)
            {
                arr[i][j]=Integer.parseInt(con.readLine());

            }
        }
    }

         public void show()
         {

         int i,j;
          for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
