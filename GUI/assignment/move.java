import java.awt.*;
import java.awt.event.*;
class move implements MouseMotionListener
{
    Frame f;
    Graphics g;
    TextField t;
    int x2,y2;
    public move()
    {
        f=new Frame();
        f.setSize(300, 400);
        f.addMouseMotionListener(this);
        t=new TextField("");
        f.add(t,"South");
        f.setVisible(true);

    }
    public void mouseMoved(MouseEvent e)
        {
            
            x2=e.getX();
            y2=e.getY();
            g = f.getGraphics();
            g.setColor(Color.BLUE);
            g.drawLine(0, 0, x2, y2);
            g.setColor(Color.red);
            g.drawLine(300, 0, x2, y2);
            g.setColor(Color.green);
            g.drawLine(0, 400, x2, y2);
            g.setColor(Color.gray);
            g.drawLine(300, 400, x2, y2);
        }
        public void mouseDragged(MouseEvent e)
        {}
    public static void main(String args[])
    {
        move line=new move();
    }
}
