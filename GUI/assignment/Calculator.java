import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
    Frame f;   TextField l; Button b,b1,b3,b4,b5,b6,b8,b9,b12,b11,b13,b14,b15,b16,b17,b18;
    String s1="",s2="",s3="";
    int count=0;
    public Calculator()
    {
         f = new Frame();
        f.setSize(300, 500);
        BorderLayout g = new BorderLayout();
        f.setLayout(g);
        l = new TextField();
        f.add(l, "North");
        Panel p = new Panel();
        GridLayout g2 = new GridLayout(4, 6);
        p.setLayout(g2);
        p.setBackground(Color.gray);
        b = new Button("1");
        b.setForeground(Color.red);
        b.addActionListener(this);
        b1 = new Button("2");
        b1.addActionListener(this);
        b3 = new Button("3");
        b3.addActionListener(this);
        b4 = new Button("+");
        b4.addActionListener(this);
        b5 = new Button("4");
        b5.addActionListener(this);
        b6 = new Button("5");
        b6.addActionListener(this);
        b8 = new Button("6");
        b8.addActionListener(this);
        b9 = new Button("-");
        b9.addActionListener(this);
        b11 = new Button("7");
        b11.addActionListener(this);
        b12 = new Button("8");
        b12.addActionListener(this);
        b13 = new Button("9");
        b13.addActionListener(this);
        b14 = new Button("*");
        b14.addActionListener(this);
        b15 = new Button("c");
        b15.addActionListener(this);
        b16 = new Button("0");
        b16.addActionListener(this);
        b17 = new Button("/");
        b17.addActionListener(this);
        b18 = new Button("=");
        b18.addActionListener(this);
        p.add(b);
        p.add(b1);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b8);
        p.add(b9);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(b17);
        p.add(b18);
        f.add(p, "Center");
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        {
            String s=e.getActionCommand(); 
                                    //extra for point type
            if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') 
            {
            if (!s2.equals(""))
            {
                s3 = s3 + s;
                l.setText(s3);
            }
            else 
                {
                    if (s.charAt(0) =='0'&&s1.equals("0"))
                    {
                        s1="0";
                        System.out.print("hello");
                    }
                    else
                    {
                    s1 = s1 + s;
                    System.out.print("ha");
                    l.setText(s1);
                    }
                    
                }
            }
            else if (s.charAt(0) == '=')
            {
                if (count==0&&s1.equals(""))
                {
                    String r=l.getText();
                    l.setText(r);
                }
                else 
                {
                    String res=l.getText();
                    double de=Double.parseDouble(res) ;
                if (s2.equals("+"))
                de = (Double.parseDouble(s1) + Double.parseDouble(s3));
                else if (s2.equals("-"))
                de = (Double.parseDouble(s1) - Double.parseDouble(s3));
                else if (s2.equals("/"))
                de = (Double.parseDouble(s1) / Double.parseDouble(s3));
                else if (s2.equals("*"))
                de = (Double.parseDouble(s1) * Double.parseDouble(s3));
                l.setText(Double.toString(de));
                s1=s2 = s3 = "";
                }
            }
            else 
            {
                if (s.charAt(0) == '-' && s1.equals("")) {
                    s1 = s1 + s;
                    System.out.print(s1);
                }
                else if (s2.equals("") || s3.equals(""))
                {s2 = s;
                System.out.print(s2);}
                else {
                    double te;
                    if (s2.equals("+"))
                    te = (Double.parseDouble(s1) + Double.parseDouble(s3));
                    else if (s2.equals("-"))
                    te = (Double.parseDouble(s1) - Double.parseDouble(s3));
                    else if (s2.equals("/"))
                    te = (Double.parseDouble(s1) / Double.parseDouble(s3));
                    else
                    te = (Double.parseDouble(s1) * Double.parseDouble(s3));
                    s1 = Double.toString(te);
                    s2 = s;
                    s3 = "";
                }
                l.setText(s1);
            }
            if(s=="c")
            {
                s1=s2=s3="";
                l.setText(s1+s2+s3);
            }
        }
    }
public static void main(String args[])
{
    Calculator c=new Calculator();
}
}