import java.awt.*;
class demo
{
    public static void main (String args[])
    {
        Frame d = new Frame();
        d.setSize(200, 130);
        d.setLocation(500, 100);
        d.setBackground(Color.orange);
        Panel gp = new Panel();

        gp.setLayout(new GridLayout(2, 0));
        Panel p = new Panel();
        p.setLayout(new GridLayout(1, 2));
        Panel p2 = new Panel();
        p2.setLayout(new GridBagLayout());
        Label l = new Label("Find Word");
        l.setForeground(Color.black);
        //
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.gridwidth = 2;
        g.gridheight = 2;
        g.ipadx = 2;
        g.ipady = 4;
        Insets i = new Insets(0, 0, 0, 50);
        g.insets = i;
        g.fill = GridBagConstraints.HORIZONTAL;
        g.anchor = GridBagConstraints.CENTER;
        g.weightx = 1.0;
        g.weighty = 1.0;
        //
        p2.add(l, g);
        p.add(p2);
        Panel p3 = new Panel();
        p3.setLayout(new GridBagLayout());
        TextField tf = new TextField();
        tf.setForeground(Color.red);
        tf.setBackground(Color.lightGray);
        Insets i2 = new Insets(0, 0, 0, 50);
        g.insets = i2;
        p3.add(tf, g);
        p.add(p3);
        gp.add(p);

        Panel bt = new Panel();
        bt.setLayout(new GridBagLayout());
        Button b1 = new Button("Find");
        b1.setForeground(Color.magenta);
        Insets i3 = new Insets(0, 130, 0, 30);
        g.insets = i3;
        g.fill = GridBagConstraints.NONE;
        bt.add(b1, g);
        gp.add(bt);

        Panel pp = new Panel();
        pp.setLayout(new GridLayout(1, 2));
        Panel ppp = new Panel();
        ppp.setLayout(new GridBagLayout());
        Button b = new Button("NEXT WORD");
        b.setBackground(Color.orange);
        b.setForeground(Color.blue);

        g.fill = GridBagConstraints.HORIZONTAL;
        Insets i9 = new Insets(0, 0, 0, 0);
        g.insets = i9;
        ppp.add(b, g);
        pp.add(ppp);

        Panel pppp = new Panel();
        pppp.setLayout(new GridBagLayout());
        Button b2 = new Button("ClOSE");
        b2.setForeground(Color.red);
        b2.addActionListener((e) -> {
            d.setVisible(false);
            d.dispose();
        });
        g.fill = GridBagConstraints.HORIZONTAL;
        Insets i10 = new Insets(0, 0, 0, 0);
        g.insets = i10;
        pppp.add(b2, g);
        pp.add(pppp);
        d.add(pp, "South");
        d.add(gp);
        d.setVisible(true);
}
}