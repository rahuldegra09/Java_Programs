class UseMatrix
{
    public static void main(String args[]) 
    {
        Matrix m1 = new Matrix();
        System.out.print("Enter 9 values:");
        System.out.println("m1 is:");
        m1.show();

        Matrix m2 = new Matrix(5,4);
        System.out.println("Enter m2 values:");
        System.out.println("m2 is:");
        m2.show();
        Matrix m3=new Matrix(m2);
        System.out.println("m3 is:");
        m3.show();
     

    }
}