import java.awt.*;
class gridbag
{
    public static void main(String arg[])
    {
        Frame f=new Frame();
        f.setSize(300,150);
        f.setLayout(new GridLayout(3,0));
        Panel p=new Panel(); 
        p.setLayout(new GridLayout(0,2));
        Panel p2=new Panel();
        p2.setLayout(new GridBagLayout());
        Label l=new Label("Name");
        GridBagConstraints g = new GridBagConstraints();
        g.gridx=0;
        g.gridy=0;
        g.gridwidth=2;
        g.gridheight=2;
        g.ipadx=9;
        g.ipady=4;
        Insets i=new Insets(0,70,0,5);
        g.insets=i;
        g.fill=GridBagConstraints.VERTICAL;
        g.anchor=GridBagConstraints.CENTER;
        g.weightx=1.0;
        g.weighty=1.0;
        p2.add(l,g);
        p.add(p2);
        Panel p3=new Panel();
        p3.setLayout(new GridBagLayout());
        TextField tf=new TextField("hello");
        Insets i2 = new Insets(0, 0, 0, 50);
        g.insets = i2;
        p3.add(tf,g);
        p.add(p3);
        f.add(p);





        Panel p4 = new Panel();
        p4.setLayout(new GridLayout(0, 2));
        Panel p5 = new Panel();
        p5.setLayout(new GridBagLayout());
        Label l2 = new Label("Surname");
        Insets i5 = new Insets(0, 70, 0, 5);
        g.insets = i5;
        p5.add(l2, g);
        p4.add(p5);
        Panel p6 = new Panel();
        p6.setLayout(new GridBagLayout());
        TextField tff = new TextField();
        Insets i7 = new Insets(0, 0, 0, 50);
        g.insets = i7;
        p6.add(tff, g);
        p4.add(p6);
        f.add(p4);
        Panel pp=new Panel();
        pp.setLayout(new GridBagLayout());
        Button b=new Button("ok");
        g.fill = GridBagConstraints.CENTER;
        Insets i9 = new Insets(0, 0, 0,0 );
        g.insets = i9;
        pp.add(b,g);
        f.add(pp);
        
        
        f.setVisible(true);
    }
}