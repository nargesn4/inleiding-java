package h10;

import h01.Show;

import java.awt.*;
import java.awt.event.*;

public class Opdracht2 extends Show {
    TextField tekstvak;
    String s,text,tekst;
    int getal;
    int hoogste;
    int laagste;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener( new Test() );
        add(tekstvak);
        hoogste =0;
        laagste =1000000000;
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(text, 50, 80 );
    }

    class Test implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt( s);
            if(getal<laagste) {
                laagste = getal;
                text="Het laagste getal tot nu toe is : "+laagste;
            }
            else if ( getal>hoogste) {
                hoogste = getal;
                tekst="Het hoogste getal tot nu toe is : "+hoogste;

            }
            else {
                tekstvak.setText("");
            }
            repaint();
        }
    }
}
