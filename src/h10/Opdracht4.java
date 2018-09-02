package h10;

import h01.Show;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Show {
    TextField tekstvak1, tekstvak2;
    Label label1, label2;
    String s, s2, tekst, lijn, rest, tekst1;
    int maand, dag, jaartal, schrikeljaar;
    Button knop;


    public void init() {
        tekstvak1 = new TextField("", 20);
        label1 = new Label("Type het maandnummer en jaar in en druk op Ok");
        tekstvak2 = new TextField("",20);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        tekst = "";
        tekst1 = "";
        add(label1);
        add(tekstvak1);
        add(tekstvak2);
        add(knop);
        lijn = "";
        rest = "";
    }

    public void paint(Graphics g) {
        g.drawString(tekst1, 40, 80 );
        g.drawString(lijn, 40, 100 );
        g.drawString(rest, 40, 100 );

    }

    class  KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            maand = Integer.parseInt( s);
            s2 = tekstvak2.getText();
            jaartal = Integer.parseInt( s2);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                schrikeljaar =1;
                tekst1 = ""+ jaartal + " is een schrikkeljaar. ";

            }
            else {
                tekst1 = ""+ jaartal + " is geen schrikkeljaar. ";
            }
            if (maand == 1){
                tekst = "januari";
                dag = 31;
                lijn = "EN het maand " + tekst + " heeft " + dag + " dagen.";
                rest = "";

            } else if (maand == 2) {
                if (schrikeljaar==1){
                dag = 29;}
                else {
                    dag=28;
                }
                tekst = "februari";
                lijn = "EN het maand " + tekst + " heeft " + dag + " dagen.";
                rest = "";

            } else if (maand == 3) {
                tekst = "maart";
                dag = 31;
                lijn = "EN het maand " + tekst + " heeft " + dag + " dagen.";
                rest = "";

            } else if (maand == 4) {
                tekst = "april";
                dag = 30;
                lijn = "EN het maand " + tekst + " heeft " + dag + " dagen.";
                rest = "";

            } else if (maand == 5) {
                tekst = "mei";
                dag = 31;
                lijn = "EN het maand " + tekst + " heeft " + dag + " dagen.";
                rest = "";

            } else if (maand == 6) {
                tekst = "juni";
                dag = 30;
                lijn = "EN het maand " + tekst + " heeft " + dag + " dagen.";
                rest = "";

            } else if (maand == 7) {
                tekst = "juli";
                dag = 31;
                lijn = "EN het maand " + tekst + " heeft " + dag + " dagen.";
                rest = "";

            } else if (maand == 8) {
                tekst = "augustus";
                dag = 31;
                lijn = "EN het maand " + tekst + " heeft " + dag + " dagen.";
                rest = "";

            } else if (maand == 9) {
                tekst = "september";
                dag = 30;
                lijn = "EN het maand " + tekst + " heeft " + dag + " dagen.";
                rest = "";

            } else if (maand == 10) {
                tekst = "october";
                dag = 31;
                lijn = "EN het maand " + tekst + " heeft " + dag + " dagen.";
                rest = "";

            } else if (maand == 11) {
                tekst = "november";
                dag = 30;
                lijn = "EN het maand " + tekst + " heeft " + dag + " dagen.";
                rest = "";

            } else if (maand == 12) {
                tekst = "december";
                dag = 31;
                lijn = "EN het maand " + tekst + " heeft " + dag + " dagen.";
                rest = "";

            } else {
                lijn = "";
                rest = "U hebt een verkeerd nummer voor maand ingetikt ..!";

            }
            repaint();
        }
    }
}
