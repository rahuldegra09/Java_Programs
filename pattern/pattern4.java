class pattern4
{
    public static void main(String[] args)
    {
        int no,i,j,s,h=0;
        no=(int)(Math.random()*10);
        System.out.println("the no of line are:"+no);
        for(i=1;i<=no;i++)
        {
            for(s=no-i;s>=1;s--)
            {
                System.out.print("  ");

            }
            for(j=1;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
                for(h=i-1;h>0;h--)
                {
                    System.out.print(h+" ");
                }
                    System.out.println();
        }
    }
}
