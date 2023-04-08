package AWT;

import org.w3c.dom.Text;

import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class AWTEx{
    AWTEx(){
        Frame f=new Frame();
        Label l=new Label("redLabel");
        Button b=new Button("button");
        TextField tx=new TextField();
        TextArea t=new TextArea("Textarea");
        Checkbox ch1=new Checkbox("Java");
        Checkbox ch2=new Checkbox("bhava");
        Choice c=new Choice();
        List ls=new List(5);

// adding menu bar to add menu ------------------------------------------------------------------------------------------------
        MenuBar mb=new MenuBar();
        Menu m=new Menu("Menu");
        Menu subMenu=new Menu("Submenu");
        MenuItem i1=new MenuItem("I1");
        MenuItem i2=new MenuItem("I2");
        MenuItem i3=new MenuItem("I3");
        MenuItem i4=new MenuItem("I4");
        MenuItem i5=new MenuItem("I5");
        MenuItem i6=new MenuItem("I6");
        m.add(i1);
        m.add(i2);
        m.add(i3);
        subMenu.add(i4);
        subMenu.add(i5);
        m.add(subMenu);
        mb.add(m);
        f.setMenuBar(mb);
//-----------------------------------------------------------------------------------------------------------------------------
       //pop menu
        PopupMenu pm=new PopupMenu("Edit");
        MenuItem ct=new MenuItem("Cut");
        ct.setActionCommand("Cut");
        MenuItem copy=new MenuItem("copy");
        copy.setActionCommand("Copy");
        MenuItem paste=new MenuItem("paste");
        paste.setActionCommand("paste");
        pm.add(ct);
        pm.add(copy);
        pm.add(paste);
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                pm.show(f,e.getX(),e.getY());
            }
        });
        f.add(pm);
        l.setBounds(20,70,80,30);
        b.setBounds(100,100,80,30);
        tx.setBounds(20,100,80,30);
        t.setBounds(30,200,200,200);
        ch1.setBounds(30,150,50,30);
        ch2.setBounds(80,150,80,30);
        c.setBounds(200,400,75,75);
        ls.setBounds(200,500,75,75);


        f.add(b);
        f.add(l);
        f.add(tx);
        f.add(t);
        f.add(ch1);
        f.add(ch2);
        f.add(ls);
        f.add(c);

        c.add("Item1");
        c.add("Item2");
        c.add("Item3");
        c.add("Item4");
        c.add("Item5");

        ls.add("l1");
        ls.add("l2");
        ls.add("l3");
        ls.add("l4");
        ls.add("l5");


        f.setSize(700,700);
        f.setTitle("Title");
        f.setLayout(null);
        f.setVisible(true);


    }
}
public class AWTExampleByAssociation {
    public static void main(String[] args) {
        AWTEx a=new AWTEx();
    }
}
