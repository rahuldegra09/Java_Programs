import java.awt.*;
import java.awt.event.*;
class card implements ActionListener
{

    Frame f;
    CardLayout cl;
    Panel P,p,p2,p3,p4,p5,p16,pf,pp,ppp,pppp,pff,P1,p1,p12,p13,p14,p15,pp1,ppp1;
    Button b2,b;
    Label l,l2,l1,l12;
    TextField tf,tff,tf1;

    public card()
    {
        f = new Frame();
        f.setSize(500 , 400);
        
        pf=new Panel();
        cl=new CardLayout();
        pf.setLayout(cl);
        P=new Panel();
        P.setLayout(new GridLayout(2, 0));
        p = new Panel();
        p.setLayout(new GridLayout(0, 2));
        p2 = new Panel();
        p2.setLayout(new GridBagLayout());
        l = new Label("Name");
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.gridwidth = 2;
        g.gridheight = 2;
        g.ipadx = 9;
        g.ipady = 4;
        Insets i = new Insets(0, 70, 0, 5);
        g.insets = i;
        g.fill = GridBagConstraints.HORIZONTAL;
        g.anchor = GridBagConstraints.CENTER;
        g.weightx = 1.0;
        g.weighty = 1.0;
        p2.add(l, g);
        p.add(p2);
        p3 = new Panel();
        p3.setLayout(new GridBagLayout());
        tf = new TextField();
        Insets i2 = new Insets(0, 0, 0, 50);
        g.insets = i2;
        p3.add(tf, g);
        p.add(p3);
        P.add(p);
        pf.add(P,"Screen1");

         p4 = new Panel();
        p4.setLayout(new GridLayout(0, 2));
         p5 = new Panel();
        p5.setLayout(new GridBagLayout());
        l2 = new Label("Surname");
        Insets i5 = new Insets(0, 70, 0, 5);
        g.insets = i5;
        p5.add(l2, g);
        p4.add(p5);
         p16 = new Panel();
        p16.setLayout(new GridBagLayout());
         tff = new TextField();
        Insets i7 = new Insets(0, 0, 0, 50);
        g.insets = i7;
        p16.add(tff, g);
        p4.add(p16);
        P.add(p4);


        pp = new Panel();
        pp.setLayout(new GridLayout(1,2));
        ppp = new Panel();
        ppp.setLayout(new GridBagLayout());
        b = new Button("previous");
        b.addActionListener(this);
        g.fill = GridBagConstraints.HORIZONTAL;
        Insets i9 = new Insets(0, 65, 0, 5);
        g.insets = i9;
        ppp.add(b, g);
        pp.add(ppp);


        pppp = new Panel();
        pppp.setLayout(new GridBagLayout());
         b2 = new Button("next");
        b2.addActionListener(this);
        g.fill = GridBagConstraints.HORIZONTAL;
        Insets i10 = new Insets(0, 5, 0, 65);
        g.insets = i10;
        pppp.add(b2, g);
        pp.add(pppp);
        f.add(pp,"South");







        P1=new Panel();
        P1.setLayout(new GridLayout(2, 0));
        p1 = new Panel();
        p1.setLayout(new GridLayout(0, 2));
        p12 = new Panel();
        p12.setLayout(new GridBagLayout());
        l1 = new Label("city");
        Insets i13= new Insets(0, 70, 0, 5);
        g.insets = i13;
        p12.add(l1, g);
        p1.add(p12);
        p13 = new Panel();
        p13.setLayout(new GridBagLayout());
        tf1 = new TextField();
        Insets i12 = new Insets(0, 10, 0, 50);
        g.insets = i12;
        p13.add(tf1, g);
        p1.add(p13);
        P1.add(p1);

         p14 = new Panel();
        p14.setLayout(new GridLayout(0, 2));
         p15 = new Panel();
        p15.setLayout(new GridBagLayout());
         l12 = new Label("colony");
        Insets i15 = new Insets(0, 70, 0, 5);
        g.insets = i15;
        p15.add(l12, g);
        p14.add(p15);
        Panel p50=new Panel();
        p50.setLayout(new GridBagLayout());
        TextField my=new TextField();
        Insets i17 = new Insets(50, 0, 50, 50);
        g.insets = i17;
        p50.add(my,g);
        p14.add(p50);
        P1.add(p14);
        pf.add(P1,"screen 2");
        f.add(pf);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
       
        if(e.getSource()==b2)
        {
            cl.next(pf);
        }
        else 
        {
            cl.previous(pf);
        }
}
public static void main (String args[])
{
    card cd=new card();
}
}