class Userational
{
    public static void main(String args[])
    {
        rational m1=new rational();
        System.out.print("m1 is :");
        m1.show();
        
        rational m2 =new rational(3,4);
        System.out.print("m2 is :");
        m2.show();
        rational m3,m4,m5,m6;
        m3=m1.add(m2);
        System.out.print("sum m3 is :");
        m3.show();
        m4=m2.sub(m1);
        System.out.print("differnce m4 is :");
        m4.show();
        m5=m2.multiple(m4);
        System.out.print("product m5  is :");
        m5.show();
        m6=m2.division(m5);
        System.out.print("division m6 is :");
        m6.show();
       
    
    }

}
