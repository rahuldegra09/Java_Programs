import java.io.*;
class shiftbyN
{
         public static void main(String[] args)
        {
            Console con=System.console();
            int arr[] = new int[10];
            int i,n,h,j;
            System.out.print("enter the array:");
            for(i=0;i<arr.length;i++)
            {
                arr[i]=Integer.parseInt(con.readLine());
            }
                System.out.print("enter a no from 1 to 9:");
                n=Integer.parseInt(con.readLine());
                j=n;
            if(n>0&&n<10)
            
            {
                for(i=0;i<arr.length&&j<arr.length;i++,j++)
                {
                    arr[i]=arr[j];
                }
            }       
                for(h=arr.length-n;h<arr.length;h++)
                  {
                    arr[h]=0;
                  }


                    System.out.println("shifted array is:");
                    for(i=0;i<arr.length;i++)
                    {
                        System.out.print(arr[i]+" ");
                    }

        }
}