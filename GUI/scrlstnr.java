import java.awt.*;
import java.awt.event.*;
class scrlstnr implements AdjustmentListener
{
    Frame f;
    Scrollbar sb;
    Panel p;
    Label l;
    TextField tf;
    public scrlstnr()
    {
        f=new Frame();
        f.setSize(500,400);
        sb=new Scrollbar(Scrollbar.VERTICAL,0,5,0,100);
        sb.addAdjustmentListener(this);
        p=new Panel();
        l=new Label("value");
        tf=new TextField(20);
        p.add(l);
        p.add(tf);
        f.add(p,"South");
        f.add(sb,"East");
        f.setVisible(true);
    }   
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        int v=sb.getValue();
        tf.setText(v+"");

    }
    public static void main(String args[])
    {
        scrlstnr s=new scrlstnr();
    }
}
