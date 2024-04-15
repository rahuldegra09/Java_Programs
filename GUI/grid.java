import java.awt.*;
class grid
{
    public static void main (String args[])
    {
        Frame f=new Frame();
        f.setSize(400,500);
        GridLayout gl=new  GridLayout(2,2);
        f.setLayout(gl);
        //1
        Panel p=new Panel();
        GridLayout gll = new GridLayout(2, 1);
        p.setLayout(gll);
        Button b = new Button("1");
        p.add(b);
        Button b1 = new Button("2");
        p.add(b1);
        f.add(p);
        //2
        Panel p1 = new Panel();
        GridLayout g1 = new GridLayout(0, 3);
        p1.setLayout(g1);
        Button b2 = new Button("3");
        p1.add(b2);
        Button b3 = new Button("4");
        p1.add(b3);
        Button b4 = new Button("5");
        p1.add(b4);
        f.add(p1);
        //3
        Panel p2 = new Panel();
        GridLayout g2 = new GridLayout(1,2);
        p2.setLayout(g2);
        Panel pep = new Panel();
        GridLayout gep = new GridLayout(2, 1);
        pep.setLayout(gep);
        Button bep = new Button("6");
        pep.add(bep);
        Button bee = new Button("7");
        pep.add(bee);
        p2.add(pep);
        
        Panel pe = new Panel();
        GridLayout ge = new GridLayout(3, 1);
        pe.setLayout(ge);
        Button be = new Button("8");
        pe.add(be);
        Button bes = new Button("9");
        pe.add(bes);
        Button bq = new Button("10");
        pe.add(bq);
        p2.add(pe);
        f.add(p2);
        //4
        Panel p3 = new Panel();
        GridLayout g3 = new GridLayout(2, 1);
        p3.setLayout(g3);

        Panel pop = new Panel();
        GridLayout gop = new GridLayout(1, 2);
        pop.setLayout(gop);
        Button bo = new Button("11");
        pop.add(bo);
        Button bd = new Button("12");
        pop.add(bd);
        p3.add(pop);
        
        Panel pip = new Panel();
        GridLayout gip = new GridLayout(1, 3);
        pip.setLayout(gop);
        Button bip = new Button("13");
        pip.add(bip);
        Button c = new Button("14");
        pip.add(c);
        Button bc = new Button("15");
        pip.add(bc);
        p3.add(pip);
        f.add(p3);
        f.setVisible(true);
    }
}