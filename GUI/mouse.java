import java.awt.*;
import java.awt.event.*;
class mouse implements MouseMotionListener
{
    Frame f;        Panel p;     Label l1,l2;   TextField tf1,tf2;
    public mouse()
    {
        f=new Frame();
        f.setSize(400,500);
        f.addMouseMotionListener(this);
        p=new Panel();
        l1=new Label("x");
        p.add(l1);
        tf1=new TextField(20);
        p.add(tf1);
        l2 = new Label("y");
        p.add(l2);
        tf2 = new TextField(20);
        p.add(tf2);
        f.add(p,"South");
        f.setVisible(true);
    }
    public void mouseMoved(MouseEvent e)
    {
        int x,y;
        x=e.getX();    y=e.getY();
        tf1.setText(x+"");   tf2.setText(y+"");
    }
    public void mouseDragged(MouseEvent e2)
    {}
    public static void main(String args[])
    {
        mouse m=new mouse();
    }
}

