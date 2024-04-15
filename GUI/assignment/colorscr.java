import java.awt.*;
import java.awt.event.*;
class colorscr implements AdjustmentListener 
{
    Frame f;
    Panel p,pf,black;
    Scrollbar sb,s,sn;
    Label l,l2,l3;
    TextField tf,tf2,tf3;
    public colorscr()
    {
         f = new Frame();
        f.setSize(300, 500);
        f.setLayout(new BorderLayout());
        p = new Panel();
        GridLayout g = new GridLayout(1, 3);
        p.setLayout(g);
        sb = new Scrollbar(Scrollbar.VERTICAL, 0, 5, 0, 260);
        sb.addAdjustmentListener(this);
        s = new Scrollbar(Scrollbar.VERTICAL, 0, 5, 0, 260);
        s.addAdjustmentListener(this);
        sn = new Scrollbar(Scrollbar.VERTICAL, 0, 5, 0, 260);
        sn.addAdjustmentListener(this);
        p.add(sb);
        p.add(s);
        p.add(sn);
        f.add(p, "East");
        pf=new Panel();
        pf.setBackground(Color.orange);
        l=new Label("I");
        tf=new TextField(4);
        l2 = new Label("LOVE");
        tf2 = new TextField(4);
        l3 = new Label("U");
        tf3 = new TextField(4);
        pf.add(l);
        pf.add(tf);
        pf.add(l2);
        pf.add(tf2);
        pf.add(l3);
        pf.add(tf3);
        f.add(pf,"South");
        black=new Panel();
        black.setBackground(Color.black);
        f.add(black);
        f.setVisible(true);
    }
        public void adjustmentValueChanged(AdjustmentEvent e)
        {
            int v1=sb.getValue();
            int v2=s.getValue();
            int v3 = sn.getValue();
            tf.setText(v1+"");
            tf2.setText(v2 + "");
            tf3.setText(v3 + "");
            black.setBackground( new Color(v1, v2, v3));
        }
    public static void main (String args[])
    {
        colorscr s=new colorscr();
    }
}