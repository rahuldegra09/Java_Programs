class UseMatrix
{
    public static void main(String args[])
    {
        Matrix m1=new Matrix();
        System.out.print("Enter 9 values:");
        m1.read();

        Matrix m2=new Matrix();
        System.out.println("Enter 9 values:");
        m2.read();
        System.out.println("m1 is:");
        m1.show();
        System.out.println("m2 is:");
        m2.show();

    }
}