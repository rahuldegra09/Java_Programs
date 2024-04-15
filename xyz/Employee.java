package a;
import a.b.Contact;
import a.b.c.Person;

public class Employee extends Contact{
    double salary;
    public Employee() {
        salary = 0;
    }

    public Employee(String n,String s,int no,double sal) {
        super(n,s,no);
        salary = sal;
    }

    public Employee(Employee e) {
        super(e);
        salary = e.salary;
    }

    public void show() {
        System.out.println("name:" +name+ "surname:" +sur+ "contact no :" +cont+ "salary is:" +salary);
    }
}