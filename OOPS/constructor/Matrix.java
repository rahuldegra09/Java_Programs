import java.io.*;
class Matrix {
    int row,column;
    private int[][] element;
    
    public Matrix()
    {
        this.row=3;
       this.column=3;
        element=new int[row][column];
    }
    public Matrix(int m,int n)
    {
        this.row=m;
        this.column=n;
        element= new int[row][column];
    }
    public Matrix(Matrix x)
    {
    
        element=new int[x.element.length][x.element[4].length] ;
       }
    public void read()
     {
        Console con = System.console();
        int i, j;
        for (i = 0; i < element.length; i++) 
        {
            for (j = 0; j < element[i].length; j++) 
            {
                element[i][j] = Integer.parseInt(con.readLine());
            }
        }
    }
    public void show()
{
    int i,j;
        for (i = 0; i < element.length; i++) 
        {
            for (j = 0; j < element[i].length; j++) 
            {
                System.out.print(element[i][j] + " ");
            }
            System.out.println();
        }
    }
}
