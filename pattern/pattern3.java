class pattern3
{
    public static void main(String[] args)
    {
        int no,i,j,h=0;
        no=(int)(Math.random()*10);
        System.out.println("the no of line are:"+no);
        for(i=1;i<=no;i++)
        {
            for(j=1;j<=i;j++,h++)
                {
                    System.out.print(h+" ");
                    if(h==9)
                        h=-1;
                }
                    System.out.println();
        }
    }
}
