package xyz;
class Roll
{
    int rollno;
    public Roll()
    {
        rollno=0;
    }
    public Roll(int rn)
    {
        rollno=rn;
    }
    public Roll(Roll rl)
    {
        rollno=rl.rollno;
    }
}
class Result extends Roll
{
    int marks;
    public Result()
    {
        marks=0;
    }
    public Result(int rn,int mks)
    {
        super(rn);
        marks=mks;
    }
    public Result(Result rs)
    {
        super(rs);
        marks=rs.marks;
    }
}
class Student extends Result{
    String name;
    public Student()
    {
        name="unknown";
    }
    public Student(int rl,String nm,int mks)
    {
        super(rl,mks);
        name=nm;
    }
    public Student(Student s)
    {
        super(s);
        name=s.name;
    }
    public void show()
    {
        System.out.println("Roll no:"+rollno+"Name:"+name+"marks:"+marks);
    }
}
