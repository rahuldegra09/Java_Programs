class OffliceEmployee 
{
    public static void main(String args[])
    {
        Employee m1=new Employee();
        System.out.println("enter details of emplyee...");
        m1.read();
        Employee m2=new Employee();
        System.out.println("enter details of 2nd emplyee:");
        m2.read();
        System.out.println("employee 1st is :");
        m1.show();
        System.out.println("employee 2snd is :");
        m2.show();



    }

}
