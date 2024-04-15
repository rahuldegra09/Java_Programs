package a.b.c;
public class Person
{
    public String name,sur;
    public Person ()
    {
        name="unknown";
        sur="unknown";

    }
    public Person(String n,String s)
    {
        name=n;
        sur=s;
    }
    public Person(Person p)
    {
        name=p.name;
        sur=p.sur;
    }   
}