class longestSeries 
{
    public static void main (String args[])
    {
        int no,i,max=0,count=0,temp=0;
        System.out.print("the numbers are :");
        for(i=0;i<10;i++)
        {
            no=(int)(Math.random()*100);
            System.out.print(+no+" ");
            if(no>max)
            {
                max=no;
                count++;
            }
            else if(temp<count)
            {
            temp=count;
            max=0;
            count=1;
            }
        }
        if (count >= temp)
         System.out.println("the longest series is:"+count);
         else
         System.out.println("the longest seris is :"+temp);
    }
}
