class pattern 
{
    public static void main(String args[])
    {
        int i,no,j;
        no=(int)(Math.random()*10);
        System.out.println("No of line: "+no);
        for(i=1;i<=no;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print(j+" ");
            System.out.println();


        }
        
    }
    
}
