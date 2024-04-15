import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.regex.*;
class Myeditor extends WindowAdapter implements ActionListener
{
    Frame f;   MenuBar mb;  Menu m1,m2;  TextArea ta;
    MenuItem nw,open,save,saveAs,exit,find,replace;
    String name,path;
    static int i=1,count=0,count1=1,dd=0;
    String frame="untitled";
    String filename;
    TextField tf,tff;
    static boolean bool,bol,fword;
    public Myeditor()
    {
        f=new Frame();
        f.setSize(800,500);
        f.setBackground(Color.red);
        mb=new MenuBar();
        m1=new Menu("FILE");
        m2 = new Menu("EDIT");
        nw=new Menu("New");
        nw.addActionListener(this);
        open=new Menu("Open");
        open.addActionListener(this);
        save = new Menu("Save");
        save.addActionListener(this);
        saveAs = new Menu("Save as");
        saveAs.addActionListener(this);
        exit = new Menu("Exit");
        exit.addActionListener((e)->{System.exit(0);});
        find=new Menu("Find");
        find.addActionListener(this);
        replace = new Menu("replace");
        replace.addActionListener(this);
        ta=new TextArea("text here");
        ta.setBackground(Color.gray);
        f.add(ta);
        m2.add(find);    m2.add(replace);     m1.add(nw);      m1.add(nw);   m1.add(open);  
        m1.add(save);    m1.add(saveAs);      m1.add(exit);    mb.add(m1);   mb.add(m2);
        f.setMenuBar(mb);
        f.setVisible(true);
        f.setTitle(frame+i);
        f.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){
                                                                                            String s=ta.getText();
                                                                                            if(!s.equals(""))
                                                                                            {
                                                                                                saveAs();
                                                                                            }
                                                                                            if(i==1)
                                                                                            {
                                                                                                System.exit(0);
                                                                                            }
                                                                                            
                                                                                            f.setVisible(false);
                                                                                            f.dispose();
                                                                                            i--;
                                                                                        }});

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==nw)
        {
            i++;
            if(!ta.getText().equals(""))
            {
                save();
            }
            filename=null;
            new Myeditor();
        }
        if(e.getSource()==open)
        {
            if (!ta.getText().equals(""))
            {
                save();
            }
                 doopen();
        }
         if(e.getSource()==save)
        {
            
            save();
        }
        if(e.getSource()==saveAs)
        {
            saveAs();
        }
        if(e.getSource()==find)
        {
            find();
        }
        if(e.getSource()==replace)
        {
            replace();
        }
        
        
    }
    
    private void doopen()
    {
            FileDialog fd = new FileDialog(f, "load", FileDialog.LOAD);
            fd.setBackground(Color.red);
            fd.setVisible(true);
            filename= fd.getDirectory() + fd.getFile();
            if (filename == null)
                return;
            try 
                {
                BufferedReader bf = new BufferedReader(new FileReader(filename));
                String line = bf.readLine();
                while (line != null)
                {
                    ta.setText(line);
                    line = bf.readLine();
                }
                bf.close();
            } 
            catch (FileNotFoundException ex) {
                System.out.println("Unable to open file '" + filename+ "'");
            }catch (IOException ex) {
                System.out.println("Error reading file '" + filename + "'");
            }
    }
        
    private void save()
    {
        if(filename==null)
        {
            saveAs();
        } 
        try
        {
            FileWriter fileReader = new FileWriter(filename);
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
            bufferedWriter.write(ta.getText());
            bufferedWriter.close();
        }
        catch (IOException ex) {
            System.out.println("Error writing to file '" + filename + "'");
        }
    }
    private void  saveAs()
    {
            FileDialog fd = new FileDialog(f, "save", FileDialog.SAVE);
            fd.setVisible(true);
            fd.setBackground(Color.black);
            filename =fd.getDirectory()+fd.getFile();
            try
            {
                FileWriter fileReader = new FileWriter(filename);
                BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
                bufferedWriter.write(ta.getText());
                bufferedWriter.close();
            }
            catch (IOException ex) {
                System.out.println("Error writing to file '" +filename + "'");
            }
    }
    private void find()
    {
        Dialog d = new Dialog(f,"Find Word");
        d.setSize(200, 130);
        d.setLocation(500, 100);
        d.setBackground(Color.orange);
        Panel gp = new Panel();

        gp.setLayout(new GridLayout(2, 0));
        Panel p = new Panel();
        p.setLayout(new GridLayout(0, 2));
        Panel p2 = new Panel();
        p2.setLayout(new GridBagLayout());
        Label l = new Label("Find Word");
        l.setForeground(Color.black);
        //
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;g.gridy = 0;g.gridwidth = 2;g.gridheight = 2;
        g.ipadx = 2;g.ipady = 4;
        Insets i = new Insets(0, 30, 0, 5);
        g.insets = i;g.fill = GridBagConstraints.HORIZONTAL;g.anchor = GridBagConstraints.CENTER;
        g.weightx = 1.0;g.weighty = 1.0;
        //
        p2.add(l, g);
        p.add(p2);
        Panel p3 = new Panel();
        p3.setLayout(new GridBagLayout());
        tf = new TextField();

        tf.setForeground(Color.red);
        tf.setBackground(Color.lightGray);
        Insets i2 = new Insets(0, 0, 0, 5);
        g.insets = i2;
        p3.add(tf, g);
        p.add(p3);
        gp.add(p);

        Panel bt = new Panel();
        bt.setLayout(new GridBagLayout());
        Button b1 = new Button("Find");
        b1.setForeground(Color.magenta);
        b1.addActionListener((e)->{fword=true;findWord();});
        Insets i3 = new Insets(0, 130, 0, 30);
        g.insets = i3;
        g.fill = GridBagConstraints.NONE;
        bt.add(b1, g);
        gp.add(bt);

        Panel pp = new Panel();
        pp.setLayout(new GridLayout(1, 2));
        Panel ppp = new Panel();
        ppp.setLayout(new GridBagLayout());
        Button b = new Button("NEXT WORD");
        b.setBackground(Color.orange);
        b.setForeground(Color.blue);
        b.addActionListener((e) -> {tf.setText("");ta.select(0, 0);});
        g.fill = GridBagConstraints.HORIZONTAL;
        Insets i9 = new Insets(0, 0, 0, 0);
        g.insets = i9;
        ppp.add(b, g);
        pp.add(ppp);

        Panel pppp = new Panel();
        pppp.setLayout(new GridBagLayout());
        Button b2 = new Button("ClOSE");
        b2.setForeground(Color.red);
        b2.addActionListener((e) -> {dd=0;d.setVisible(false);d.dispose();});
        g.fill = GridBagConstraints.HORIZONTAL;
        Insets i10 = new Insets(0, 0, 0, 0);
        g.insets = i10;
        pppp.add(b2, g);
        pp.add(pppp);
        d.add(pp, "South");
        d.add(gp);
        d.setVisible(true);
        d.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                d.setVisible(false);
                d.dispose();
            }
        });
    }
    private void findWord()
    {
        if(fword==true)
        {
            Pattern p=Pattern.compile(tf.getText());
            Matcher m = p.matcher(ta.getText());
            while(m.find()&& (!tf.getText().equals("")))
            {
                if(dd<m.end())
                {
                    count=m.start();
                    count1=m.end();
                    ta.select(count,count1);
                    dd=m.end();
                    break;
                }
            }
            if(m.find()==false)
            {
                m.reset();
                dd=0;
            }
        }
    
        Pattern p1 = Pattern.compile(tf.getText());
        Matcher m1 = p1.matcher(ta.getText());
        if(m1.find()&&(!tf.getText().equals("")))
        {
            if (bol == true) 
            {
                ta.replaceText(tff.getText(), m1.start(), m1.end());
                bol = false;
                ta.select(m1.start(), m1.end());
            }     
            while(m1.find())
            {       
                if(bool==true)
                {
                     ta.setText(m1.replaceAll(tff.getText()));
                    bool=false;
                    ta.setSelectionEnd(0);
                }
            }
        }
            else
               {
                  tf.setText("!No Match");
                   i++;
                   ta.setSelectionEnd(0);
                }     
    }           
    private void replace()
    {
        Dialog fd= new Dialog(f,"Replace");
        fd.setSize(300, 150);
        fd.setLocation(400, 150);
        fd.setBackground(Color.magenta);
        Panel P = new Panel();
        P.setLayout(new GridLayout(2, 0));
        Panel p = new Panel();
        p.setLayout(new GridLayout(0, 2));
        Panel p2 = new Panel();
        p2.setLayout(new GridBagLayout());
        Label l = new Label("Word -");
        GridBagConstraints g = new GridBagConstraints();
        //
        g.gridx = 0;g.gridy = 0;g.gridwidth = 2;g.gridheight = 2;g.ipadx = 9;g.ipady = 4;
        Insets i = new Insets(0, 100, 0, 5);
        g.insets = i;g.fill = GridBagConstraints.HORIZONTAL;g.anchor = GridBagConstraints.CENTER;
        g.weightx = 1.0;g.weighty = 1.0;
        //
        p2.add(l, g);
        p.add(p2);
        Panel p3 = new Panel();
        p3.setLayout(new GridBagLayout());
        tf = new TextField();
        tf.setBackground(Color.gray);
        Insets i2 = new Insets(0, 0, 0, 50);
        g.insets = i2;
        p3.add(tf, g);
        p.add(p3);
        P.add(p);
        Panel p4 = new Panel();
        p4.setLayout(new GridLayout(0, 2));
        Panel p5 = new Panel();
        p5.setLayout(new GridBagLayout());
        Label l2 = new Label("Replace with -");
        Insets i5 = new Insets(0, 50, 0, 5);
        g.insets = i5;
        p5.add(l2, g);
        p4.add(p5);
        Panel p16 = new Panel();
        p16.setLayout(new GridBagLayout());
        tff = new TextField();
        tff.setBackground(Color.lightGray);
        tff.setForeground(Color.red);
        Insets i7 = new Insets(0, 0, 0, 40);
        g.insets = i7;
        p16.add(tff, g);
        p4.add(p16);
        P.add(p4);
        Panel pp = new Panel();
        pp.setLayout(new GridLayout(1, 3));
        Panel r1 = new Panel();
        r1.setLayout(new GridBagLayout());
        Button b3 = new Button("Replace All");
        b3.setBackground(Color.magenta);
        b3.setForeground(Color.blue);
        b3.addActionListener((e) -> {bool=true;findWord();});
        g.fill = GridBagConstraints.HORIZONTAL;
        Insets i19 = new Insets(0, 0, 0, 0);
        g.insets = i19;
        r1.add(b3, g);
        pp.add(r1);
        Panel ppp = new Panel();
        ppp.setLayout(new GridBagLayout());
        Button b = new Button("Replace");
        b.addActionListener((e) -> {bol=true;findWord();});
        g.fill = GridBagConstraints.HORIZONTAL;
        Insets i9 = new Insets(0, 0, 0, 0);
        g.insets = i9;
        ppp.add(b, g);
        pp.add(ppp);
        Panel pppp = new Panel();
        pppp.setLayout(new GridBagLayout());
        Button b2 = new Button("Close");
        b2.setBackground(Color.red);
        b2.setForeground(Color.red);
        b2.addActionListener((e) -> {fd.setVisible(false);fd.dispose();});
        g.fill = GridBagConstraints.HORIZONTAL;
        Insets i10 = new Insets(0, 0, 0, 6);
        g.insets = i10;
        pppp.add(b2, g);
        pp.add(pppp);
        fd.add(P);
        fd.add(pp, "South");
        fd.setVisible(true);
        fd.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                fd.setVisible(false);
                fd.dispose();
            }
        });
    }
    
public static void main(String args[])
    {
        Myeditor e1=new Myeditor();
    }
}

