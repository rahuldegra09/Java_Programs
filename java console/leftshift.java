import java.io.*;
class leftshift
{
         public static void main(String[] args)
        {
            Console con=System.console();
            int arr[] = new int[10];
            int i;
            System.out.print("enter the array:");
            for(i=0;i<arr.length;i++)
            {
                arr[i]=Integer.parseInt(con.readLine());
            }
            for(i=0;i<arr.length-1;i++)
            {
                    arr[i]=arr[i+1];  
            } 
            arr[9]=0;
            System.out.println("shifted array is:");
            for(i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }

        }
}