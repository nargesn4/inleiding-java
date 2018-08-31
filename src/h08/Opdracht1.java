package h08;

import h01.Show;

import java.awt.*;
import java.awt.event.*;

public class Opdracht1 extends Show {
    String schermText;
    TextField tekstvak;
    Label label;
    Button knop1;
    Button knop2;

    public void init() {
        schermText = "";
        tekstvak = new TextField("", 20);
        label = new Label("Voor en Achternaam: ");
        add(label);
        add(tekstvak);
        knop1 = new Button();
        knop1.setLabel( "Ok" );
        add(knop1);
        knop2 = new Button();
        knop2.setLabel( "Reset" );
        add(knop2);
        KnopListener ok = new KnopListener();
        knop1.addActionListener( ok );
        Reset k2 = new Reset();
        knop2.addActionListener( k2 );
    }

    public void paint(Graphics g) {
        g.drawString(schermText, 50, 60 );
    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            schermText = "Hallo "+s ;
            repaint();
        }
    }
    class Reset implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermText = " " ;
            repaint();
        }

    }
}
