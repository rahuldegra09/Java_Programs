import java.io.*;
class Employee
{
        private String name;
        private int age;
        private double salary;
        public void read()
        {
            Console con=System.console();
            System.out.print("Enter tha name :");
            name=con.readLine();
            System.out.println("enter the age of employee:");
            age=Integer.parseInt(con.readLine());
            System.out.println("enter the salary of employee:");
            salary= Integer.parseInt(con.readLine());
        }
        public void show()
        {
            System.out.print("name :"+name+",");
            System.out.print("age ="+age+",");
            System.out.println("salary ="+salary);
        }
}
