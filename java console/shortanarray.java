import java.io.*;
class shortanarray 
{
         public static void main(String[] args)
        {
            Console con=System.console();
            int arr[] = new int[10];
            int temp=0,i,j=0;
            System.out.print("enter the array:");
            for(i=0;i<arr.length;i++)
            {
                arr[i]=Integer.parseInt(con.readLine());
            }
            
            for(i=0;i<arr.length;i++)
            {
                for(j=i+1;j<arr.length;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        
    
            System.out.print("sorted array is:");
            for(i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
}



