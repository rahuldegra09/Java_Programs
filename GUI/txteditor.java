import java.awt.*;
import java.awt.event.*;
class txteditor implements ActionListener
{
    Frame f;            Button b1,b2,b3;             TextField tf;
    public txteditor()
    {
        f=new Frame();
        f.setSize(500,400);
        f.setLayout(new FlowLayout());
        b1=new Button("one");
        b1.addActionListener(this);
        b2=new Button("two");
        b2.addActionListener(this);
        b3=new Button("three");
        b3.addActionListener(this);
        tf =new TextField(40);
        f.add(tf);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String s=e.getActionCommand();
            tf.setText("one"+s);

        }
        else if(e.getSource()==b2)
        {
            tf.setText("two");
        }
        else 
            tf.setText("three");
    }
public static void main(String args[])
{
    txteditor d=new txteditor();
}
}