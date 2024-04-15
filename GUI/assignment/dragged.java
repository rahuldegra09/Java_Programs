import java.awt.*;
import java.awt.event.*;

class dragged implements MouseMotionListener {
    Frame f;
    Graphics g;
    TextField t;
    int x2, y2;
    public dragged() {
        f = new Frame();
        f.setSize(300, 400);
        f.addMouseMotionListener(this);
        t = new TextField("");
        f.add(t, "South");
        f.setVisible(true);
    }
    public void mouseMoved(MouseEvent e) {
    }
    public void mouseDragged(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.drawLine(x2,y2, x2, y2);
    }
    public static void main(String args[]) {
       new dragged();
    }
}
