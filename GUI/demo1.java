import java.awt.*;
class demo1
{
    public static void main(String args[])
    {
        Frame f=new Frame();
        f.setSize(400,300);
        f.setLayout(new FlowLayout());
        CheckboxGroup pizzaGroup=new CheckboxGroup();
        Checkbox cbLarge=new Checkbox("Large Pizza",pizzaGroup,false);
         Checkbox cbMedium=new Checkbox("Medium Pizza",pizzaGroup,false);
          Checkbox cbsmall=new Checkbox("small Pizza",pizzaGroup,false);
        f.add(cbMedium);
        Choice ch=new Choice();
        ch.add("java");
        ch.add("c++");
        ch.add("python");
        ch.add("css");
        ch.add(".net");
        f.add(ch);
        List ml=new List(0,false);
        ml.add("rrr");
        ml.add("hadoop");
        ml.add("python");
         ml.add("java");
         f.add(ml);
        f.setVisible(true);
    }
}