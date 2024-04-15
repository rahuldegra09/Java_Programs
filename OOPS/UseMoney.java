class UseMoney
{
    public static void main(String args[])
    {
        Money m1;
        m1=new Money();
        m1.set(100,200);
        System.out.print("money m1 is:");
        m1.show();

        Money m2;
        m2=new Money();
        m2.set(23,43);
        System.out.print("Money m2 is:");
        m2.show();
    }
    
}
