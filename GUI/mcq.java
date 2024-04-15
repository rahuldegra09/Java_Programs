import java.awt.*;
class mcq
{
    public static void main(String args[])
    {
        Frame f =new Frame();
        f.setSize(400,180);
        f.setLayout(new BorderLayout());
        Label l=new Label("Q.Capital of rajasthan.......?");
        l.setLocation(0, 0);
        f.add(l,"North");
        Panel p5=new Panel();
        p5.setLayout(new GridLayout(4,1));
            Label l1 = new Label("a.");
            Label l2 = new Label("b.");
            Label l3 = new Label("c.");
            Label l4 = new Label("d.");
            p5.add(l1);
            p5.add(l2);
            p5.add(l3);
            p5.add(l4);
            f.add(p5,"West");
        Panel p=new Panel();
        p.setLayout(new BorderLayout());
        Checkbox capita = new Checkbox("Bikaner", false);
        p.add(capita,"North");
        
        Panel p1=new Panel();
        p1.setLayout(new BorderLayout());
        Checkbox capital = new Checkbox("jaipur",false);
        p1.add(capital,"North");
        p.add(p1);
        
        Panel p2 = new Panel();
        p2.setLayout(new BorderLayout());
        Checkbox capit = new Checkbox("Jhodpur", false);
        p2.add(capit, "North");
        p1.add(p2);
        
        Panel p3 = new Panel();
        p3.setLayout(new BorderLayout());
        Checkbox cap = new Checkbox("Ajmer", false);
        p3.add(cap, "North");
        p2.add(p3);
        f.add(p);
        
        Panel p4= new Panel();
        p4.setLayout(new FlowLayout());
        Button pr =new Button("prev");
        Button n = new Button("Next");
        p4.add(pr);
        p4.add(n);
        p3.add(p4);


        
        
        
        
        
        
        
        f.setVisible(true);
        
    }
}