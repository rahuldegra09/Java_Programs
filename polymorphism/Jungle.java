class Jungle
{
    public static void main(String args[])
    {
        Animal a;
        a=new Dog();
        a.speak();
        a.move();
        a=new Horse();
        a.speak();
        a.move();
    }
}