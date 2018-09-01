package h10;

import h01.Show;
import java.awt.*;
import java.awt.event.*;


public class Opdracht1 extends Show {
    TextField tekstvak;
    String s;
    int getal;
    int hoogste;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener( new TekstvakListener() );
        add(tekstvak);
        hoogste =0;
    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste getal tot nu toe is : "+hoogste, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
           getal = Integer.parseInt( s);
            if ( getal>hoogste) {
                hoogste = getal;
            }
            else {
                tekstvak.setText("");
            }
            repaint();
        }
    }
}