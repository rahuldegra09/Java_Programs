class palindrome100
{
    public static void main(String[] args)
    {
        int rev=0,rem,num=0,i;
        for(i=1;i<=100;i++)
        i=num;
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        
        
        if(i==rev)
            System.out.println(+rev);
    
            }
        }
    }   