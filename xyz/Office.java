import a.Employee;

class Office {
    public static void main (String args[])
    {
        Employee E2=new Employee();
        System.out.print("second employee is :");
        E2.show();
        Employee E1= new Employee("a","b",2,3);
        System.out.print("first  employee is :");
        E1.show();
        Employee E3 = new Employee(E1);
        System.out.print("third employee is :");
        E3.show();

    }

}