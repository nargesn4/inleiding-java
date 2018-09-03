package h10;

import h01.Show;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Show {
    TextField tekstvak1, tekstvak2, tekstvak3, tekstvak4, tekstvak5;
    Button knop;
    Label label;
    String s, tekst1, tekst2, tekst3, tekst4, tekst5,Gemiddeld;
    int getal1, getal2, getal3, getal4, getal5, gemiddeld;

    public void init() {
        label = new Label("type je cijfers in en druk op Ok");
        tekstvak1 = new TextField("",10);
        tekstvak2 = new TextField("",10);
        tekstvak3 = new TextField("",10);
        tekstvak4 = new TextField("",10);
        tekstvak5 = new TextField("",10);
        knop = new Button("Ok");
        add(label);
        add(tekstvak1);
        tekstvak1.addActionListener(new TekstVakListener1());
        tekstvak2.addActionListener(new TekstVakListener2());
        tekstvak3.addActionListener(new TekstVakListener3());
        tekstvak4.addActionListener(new TekstVakListener4());
        tekstvak5.addActionListener(new TekstVakListener5());
        knop.addActionListener(new KnopListener5());
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(tekstvak5);
        add(knop);
        tekst1 ="";
        tekst2 = "";
        tekst3 = "";
        tekst4 = "";
        tekst5 = "";
        Gemiddeld = "";





    }

    public void paint(Graphics g) {
        g.drawString(tekst1,20,80);
        g.drawString(tekst2,20,100);
        g.drawString(tekst3,20,120);
        g.drawString(tekst4,20,140);
        g.drawString(tekst5,20,160);
        g.drawString(Gemiddeld,20,180);
    }
    class TekstVakListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           s = tekstvak1.getText();
           getal1 =Integer.parseInt(s);
            if (getal1<=5){
               tekst1="Onvoldoende";
            } else {
                tekst1="voldoende";
            }
            repaint();
        }
    }
    class TekstVakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak2.getText();
            getal2 =Integer.parseInt(s);
            if (getal2<=5){
                tekst2="Onvoldoende";
            } else {
                tekst2="voldoende";
            }
            repaint();
        }
    }
    class TekstVakListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak3.getText();
            getal3 =Integer.parseInt(s);
            if (getal3<=5){
                tekst3="Onvoldoende";
            } else {
                tekst3="voldoende";
            }
            repaint();
        }
    }
    class TekstVakListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak4.getText();
            getal4 =Integer.parseInt(s);
            if (getal4<=5){
                tekst4="Onvoldoende";
            } else {
                tekst4="voldoende";
            }
            repaint();
        }
    }
    class TekstVakListener5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak5.getText();
            getal5 =Integer.parseInt(s);
            if (getal5<=5){
                tekst5="Onvoldoende";
            } else {
                tekst5="voldoende";
            }
            repaint();
        }
    }
    class KnopListener5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1,s2,s3,s4,s5;
            s1 = tekstvak1.getText();
            getal1 =Integer.parseInt(s1);
            s2 = tekstvak2.getText();
            getal2 =Integer.parseInt(s2);
            s3 = tekstvak3.getText();
            getal3 =Integer.parseInt(s3);
            s4 = tekstvak4.getText();
            getal4 =Integer.parseInt(s4);
            s5 = tekstvak5.getText();
            getal5 =Integer.parseInt(s5);
            gemiddeld = (getal1+getal2+getal3+getal4+getal5)/5;
            if (gemiddeld<=5){
                Gemiddeld="je bent niet geslagen";
            } else {
                Gemiddeld="gefeliciteerd, je bent geslaagd";
            }
            repaint();
        }
    }
}
