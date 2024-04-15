import java.awt.*;
import java.awt.event.*;

class a implements ActionListener {
static CardLayout cl;
static Panel p6;
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setSize(400, 300);
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p5 = new Panel();
        p6 = new Panel();
        f.add(p6, "Center");
        cl = new CardLayout();
        p6.setLayout(cl);
        // form 1
        p1.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 100;
        Insets i = new Insets(10, 0, 10, 0);
        gbc.insets = i;
        gbc.anchor = GridBagConstraints.WEST;

        Label l1 = new Label("Name");
        TextField t1 = new TextField();
        Label l2 = new Label("Surname");
        TextField t2 = new TextField();
        Label l3 = new Label("Age");
        TextField t3 = new TextField();
        Label l4 = new Label("Qualification");
        TextField t4 = new TextField();

        p1.add(l1, gbc);
        gbc.gridx = 1;
        p1.add(t1, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        p1.add(l2, gbc);
        gbc.gridx = 1;
        p1.add(t2, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        p1.add(l3, gbc);
        gbc.gridx = 1;
        p1.add(t3, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        p1.add(l4, gbc);
        gbc.gridx = 1;
        p1.add(t4, gbc);

        // Form 2
        p3.setLayout(new GridBagLayout());
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gbc2.ipadx = 100;
        Insets i2 = new Insets(10, 0, 10, 0);
        gbc2.insets = i2;
        gbc2.anchor = GridBagConstraints.WEST;

        Label l21 = new Label("H.No.");
        TextField t21 = new TextField();
        Label l22 = new Label("Area");
        TextField t22 = new TextField();
        Label l23 = new Label("City");
        TextField t23 = new TextField();
        Label l24 = new Label("Pinconde");
        TextField t24 = new TextField();

        p3.add(l21, gbc2);
        gbc2.gridx = 1;
        p3.add(t21, gbc2);
        gbc2.gridx = 0;
        gbc2.gridy = 1;
        p3.add(l22, gbc2);
        gbc2.gridx = 1;
        p3.add(t22, gbc2);
        gbc2.gridx = 0;
        gbc2.gridy = 2;
        p3.add(l23, gbc2);
        gbc2.gridx = 1;
        p3.add(t23, gbc2);
        gbc2.gridx = 0;
        gbc2.gridy = 3;
        p3.add(l24, gbc2);
        gbc2.gridx = 1;
        p3.add(t24, gbc2);

        // Form 3
        p4.setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 100;

        Label l31 = new Label("State");
        TextField t31 = new TextField();
        Label l32 = new Label("Phone");
        TextField t32 = new TextField();
        Label l33 = new Label("Mobile");
        TextField t33 = new TextField();
        Label l34 = new Label("Email");
        TextField t34 = new TextField();

        p4.add(l31, gbc);
        gbc.gridx = 1;
        p4.add(t31, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        p4.add(l32, gbc);
        gbc.gridx = 1;
        p4.add(t32, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        p4.add(l33, gbc);
        gbc.gridx = 1;
        p4.add(t33, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        p4.add(l34, gbc);
        gbc.gridx = 1;
        p4.add(t34, gbc);

        // form 4
        p5.setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 100;

        Label l41 = new Label("Sallary");
        TextField t41 = new TextField();
        Label l42 = new Label("M.R.A.");
        TextField t42 = new TextField();
        Label l43 = new Label("T.A.");
        TextField t43 = new TextField();
        Label l44 = new Label("D.A.");
        TextField t44 = new TextField();

        p5.add(l41, gbc);
        gbc.gridx = 1;
        p5.add(t41, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        p5.add(l42, gbc);
        gbc.gridx = 1;
        p5.add(t42, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        p5.add(l43, gbc);
        gbc.gridx = 1;
        p5.add(t43, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        p5.add(l44, gbc);
        gbc.gridx = 1;
        p5.add(t44, gbc);

        p6.add(p1, "a");
        p6.add(p3, "b");
        p6.add(p4, "c");
        p6.add(p5, "d");

        a abc=new a();
        Button b1 = new Button("Back");
        b1.addActionListener(abc);
        p2.add(b1);
        Button b2 = new Button("Next");
        b2.addActionListener(abc);
        p2.add(b2);
        f.add(p2, "South");

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        cl.previous(p6);
        cl.next(p6);
    }

}