package h10;

import h01.Show;

import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Show{
    TextField tekstvak;
    Label label;
    String s, tekst, lijn, rest;
    int maand;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
        lijn = "";
        rest = "";
    }

    public void paint(Graphics g) {
        g.drawString(lijn, 100, 80 );
        g.drawString(rest, 100, 80 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            switch(maand) {
                case 1:
                    tekst = "januari";
                    dag = 31;
                    lijn = "Het maand is "+ tekst+" en heeft "+dag+ " dagen.";
                    rest= "";
                    break;
                case 2:
                    tekst = "februari";
                    dag = 28;
                    lijn = "Het maand is "+ tekst+" en heeft "+dag+ " dagen.";
                    rest= "";
                    break;
                case 3:
                    tekst = "maart";
                    dag = 31;
                    lijn = "Het maand is "+ tekst+" en heeft "+dag+ " dagen.";
                    rest= "";
                    break;
                case 4:
                    tekst = "april";
                    dag = 30;
                    lijn = "Het maand is "+ tekst+" en heeft "+dag+ " dagen.";
                    rest= "";
                    break;
                case 5:
                    tekst = "mei";
                    dag = 31;
                    lijn = "Het maand is "+ tekst+" en heeft "+dag+ " dagen.";
                    rest= "";
                    break;
                case 6:
                    tekst = "juni";
                    dag = 30;
                    lijn = "Het maand is "+ tekst+" en heeft "+dag+ " dagen.";
                    rest= "";
                    break;
                case 7:
                    tekst = "juli";
                    dag = 31;
                    lijn = "Het maand is "+ tekst+" en heeft "+dag+ " dagen.";
                    rest= "";
                    break;
                case 8:
                    tekst = "augustus";
                    dag = 31;
                    lijn = "Het maand is "+ tekst+" en heeft "+dag+ " dagen.";
                    rest= "";
                    break;
                case 9:
                    tekst = "september";
                    dag = 30;
                    lijn = "Het maand is "+ tekst+" en heeft "+dag+ " dagen.";
                    rest= "";
                    break;
                case 10:
                    tekst = "october";
                    dag = 31;
                    lijn = "Het maand is "+ tekst+" en heeft "+dag+ " dagen.";
                    rest= "";
                    break;
                case 11:
                    tekst = "november";
                    dag = 30;
                    lijn = "Het maand is "+ tekst+" en heeft "+dag+ " dagen.";
                    rest= "";
                    break;
                case 12:
                    tekst = "december";
                    dag = 31;
                    lijn = "Het maand is "+ tekst+" en heeft "+dag+ " dagen.";
                    rest= "";
                    break;
                default:
                    lijn="";
                    rest = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}
