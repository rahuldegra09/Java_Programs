import java.io.*;
class circularshift
{
         public static void main(String[] args)
        {
            Console con=System.console();
            int arr[] = new int[10];
            int i,temp;
            System.out.print("enter the array:");
            for(i=0;i<arr.length;i++)
            {
                arr[i]=Integer.parseInt(con.readLine());
            }
            System.out.println("without shift array is:");
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            temp=arr[0];
            for(i=0;i<arr.length-1;i++)
            {
                    arr[i]=arr[i+1];
            }
                    arr[arr.length-1]=temp; 

            System.out.println("shifted array is:");
            for(i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
}