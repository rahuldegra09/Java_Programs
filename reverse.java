class reverse
{
    public static void main(String args[])
    {
        int no,rev=0,rem;
        no=(int)(Math.random()*10000);
        System.out.println("generated no is:"+no);
        while(no!=0)
        {
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.print("Rev is: "+rev);
        
    }

}