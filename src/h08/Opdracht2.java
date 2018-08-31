package h08;

import h01.Show;

import java.awt.*;
import java.awt.event.*;

public class Opdracht2 extends Show {
    int mannenTeller;
    int vrouwenTeller;
    int potentiëleVrouwenTeller;
    int potentiëleManenTeller;
    int total;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;

    public void init() {
        knop1 = new Button();
        knop1.setLabel( "Man" );
        Knop1Listener kl = new Knop1Listener();
        knop1.addActionListener( kl );
        add(knop1);
        knop2 = new Button();
        knop2.setLabel( "Vrouw" );
        Knop2Listener k2 = new Knop2Listener();
        knop2.addActionListener( k2 );
        add(knop2);
        knop3 = new Button();
        knop3.setLabel( "potentiële vrouw" );
        Knop3Listener k3 = new Knop3Listener();
        knop3.addActionListener( k3 );
        add(knop3);
        knop4 = new Button();
        knop4.setLabel( "potentiële man" );
        Knop4Listener k4 = new Knop4Listener();
        knop4.addActionListener( k4 );
        add(knop4);
        total= 0;
    }

    public void paint(Graphics g) {
        g.drawString("manen in total: "+mannenTeller, 50, 60 );
        g.drawString("vrouwen in total: "+vrouwenTeller, 50, 80 );
        g.drawString("potentiële vrouwen in total: "+potentiëleVrouwenTeller
                , 50, 100 );
        g.drawString("potentiëlemanen in total: "+potentiëleManenTeller, 50, 120 );
        g.drawString("En de total is: "+total++, 50, 140 );
    }
    class Knop1Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            mannenTeller++;
            repaint();
        }
    }
    class Knop2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
           vrouwenTeller++;
            repaint();
        }
    }
    class Knop3Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            potentiëleVrouwenTeller++;
            repaint();
        }
    }
    class Knop4Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
           potentiëleManenTeller++;
            repaint();
        }
    }

}
