import java.awt.*;
import java.awt.*;
class scrbarr
{
    public static void main(String arg[])
    {
        Frame f=new Frame();
        f.setSize(300,300);
        Panel p=new Panel();
        GridLayout  g=new GridLayout(1,3);
        p.setLayout(g);
        Scrollbar sb=new Scrollbar(Scrollbar.VERTICAL,11,5,0,500);
        Scrollbar s = new Scrollbar(Scrollbar.VERTICAL,89, 5, 0, 100);
        Scrollbar sn = new Scrollbar(Scrollbar.VERTICAL, 500, 5, 0, 1000);
        p.add(sb);
        p.add(s);
        p.add(sn);
        f.add(p,"East");
        f.setVisible(true);
    }
}