class pattern
{
    public static void main(String[] args)
    {
        int no,i,j;
        no=(int)(Math.random()*10);
        System.out.println("the no of line are:"+no);
        for(i=1;i<=no;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }


    }
    
}
