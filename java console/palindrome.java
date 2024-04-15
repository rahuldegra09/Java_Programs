import java.io.Console;
class palindrome
{
    public static void main(String[] args)
    {
        Console log=System.console();
        int no,rev=0,rem,num;
        System.out.print("enter the number");
        num=Integer.parseInt(log.readLine());
        no=num;
        do{
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }while(num!=0);
        if(no==rev)
            System.out.print(+rev);
        else
            System.out.print("not a palindrome");

    }
}
