class Animal
{
    public void speak()
    {
        System.out.print("animal speak");
    }
    public void move()
    {
        System.out.print("animal moves");

    }
}
class Dog extends Animal
{
    public void speak()
    {
        System.out.print("Dog speak");
    }
    public void move()
    {
        System.out.print("Dog jump");
    }
}
class Horse extends Animal {
    public void speak()
    {
        System.out.print("Horse neighs");
    }
    public void move()
    {
        System.out.print("Horse runs");
    }
}