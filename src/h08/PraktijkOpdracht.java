package h08;

import h01.Show;

import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Show {

    TextField tekstvak;
    TextField tekstvak2;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    double getal1;
    double getal2;
    double uitkomst;
    Label label1;
    Label label2;

    public void init() {
        tekstvak = new TextField("",15);
        tekstvak2 = new TextField("",15);
        knop1 = new Button("*");
        knop2 = new Button("/");
        knop3 = new Button("+");
        knop4 = new Button("-");
        add(tekstvak);
        add(tekstvak2);
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
        knop1.addActionListener(new Vermenigvuldigen());
        knop2.addActionListener(new Delen());
        knop3.addActionListener(new Optellen());
        knop4.addActionListener(new Aftrekken());


    }

    public void paint(Graphics g) {


    }
    class Vermenigvuldigen implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal1 = Double.parseDouble(s);
            String m = tekstvak2.getText();
            getal2 = Double.parseDouble(m);
            uitkomst = getal1*getal2;
            String n =Double.toString(uitkomst);
            tekstvak.setText(n);
            tekstvak2.setText("");
            repaint();
        }
    }
    class Delen implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal1 = Double.parseDouble(s);
            String m = tekstvak2.getText();
            getal2 = Double.parseDouble(m);
            uitkomst = getal1/getal2;
            String n =Double.toString(uitkomst);
            tekstvak.setText(n);
            tekstvak2.setText("");
            repaint();
        }
    }
    class Optellen implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal1 = Double.parseDouble(s);
            String m = tekstvak2.getText();
            getal2 = Double.parseDouble(m);
            uitkomst = getal1+getal2;
            String n =Double.toString(uitkomst);
            tekstvak.setText(n);
            tekstvak2.setText("");
            repaint();
        }
    }
    class Aftrekken implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal1 = Double.parseDouble(s);
            String m = tekstvak2.getText();
            getal2 = Double.parseDouble(m);
            uitkomst = getal1-getal2;
            String n =Double.toString(uitkomst);
            tekstvak.setText(n);
            tekstvak2.setText("");
            repaint();
        }
    }
}
