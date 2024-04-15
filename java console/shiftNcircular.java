import java.io.*;
class shiftNcircular
{
         public static void main(String[] args)
        {
            Console con=System.console();                       
            int arr[] = new int[10];
            int i,n,h;
            System.out.print("enter the array:");`        
            for(i=0;i<arr.length;i++)                   
            {
                arr[i]=Integer.parseInt(con.readLine());
            }
                System.out.print("enter a no from 1 to 9:");
                n=Integer.parseInt(con.readLine());
                n=n%10;
            while(n>0)
                {
                    h=arr[0];
                for(i=0;i<arr.length-1;i++)         
                {
                    arr[i]=arr[i+1];
                }
                    arr[arr.length-1]=h;
                    n--;
                }
                System.out.println("shifted array is:");
                    for(i=0;i<arr.length;i++)                                        
                    {
                        System.out.print(arr[i]+" ");
                    }

        }
}