class maxin10 
{
    public static void main(String args[])
    {
        int i,no,max;
        System.out.print("Generated vaue are:");
        for(i=1,max=0;i<=10;i++)
        {
            no=(int)(Math.random()*100);
            System.out.print(no+" ");
            if(no>max)
                max=no;
        }
        System.out.print("\nmax is:"+max);
        }
    }

