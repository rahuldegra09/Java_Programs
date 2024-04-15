import java.io.*;
class ExtraSpace
  {
        public static void main(String args[])
        {
            Console con=System.console();
            String str;
            System.out.print("enter the sentence:");
            str=con.readLine();
            char arr[]=new char[str.length()];
            arr=str.toCharArray();
            int i,j;
            for(i=0;i<arr.length;i++)
            {
              if((arr[i]==' ')&&(arr[i+1]==' '))
              {
              for(j=i;j<arr.length;j++)
              {
                if ((arr[j] == ' ') && (arr[j + 1] == ' '))
                arr[j]=arr[j+1];
              
              }
            
              }
            }
            System.out.print(arr);
        }
}
