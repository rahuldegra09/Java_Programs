package a.b; 
import a.b.c.Person;
public class Contact extends Person {
    public int cont;
    public Contact() {
        cont = 0;
    }

    public Contact(String n, String s, int no) {
        super(n,s);
        cont = no;
    }

    public Contact(Contact x) {
        super(x);
        cont = x.cont;
    }
}