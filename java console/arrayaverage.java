import java.io.*;
class arrayaverage 
{
    public static void main(String[] args)
    {
        Console con=System.console();
        int arr[] = new int[10];
        int i,avg=0,sum;
        System.out.print("enter the vaules:");
        for(i=0,sum=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(con.readLine());
            sum=sum+arr[i];
        }
        avg=sum/arr.length;
        System.out.println("Average is:"+avg);
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>avg)
            System.out.println(arr[i]+" ");
            
        }
    }
}
