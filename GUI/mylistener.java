import java.awt.*;
import java.awt.event.*;
class mylistener1 implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        String str=e.getActionCommand();
        if(str.equals("one"))
            {
                System.out.print("one");
            }
        else if(str.equals("two"))
            {
                 System.out.print("two");
            }
            else
            {
                System.out.print("three");
            }
            }
    }
class mylistener
{
    public static void main(String args[])
    {
        Frame f=new Frame();
        f.setSize(200,200);
        f.setLayout(new FlowLayout());
        mylistener1 m=new mylistener1();
        Button b=new Button ("one");
        b.addActionListener(m);
        Button b2=new Button("two");
        b2.addActionListener(m);
        Button b3 = new Button("three");
        b3.addActionListener(m); 
        f.add(b);
        f.add(b2);
        f.add(b3);
        f.setVisible(true);
    }
}
