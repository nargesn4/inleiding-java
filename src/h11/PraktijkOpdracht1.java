package h11;

import h01.Show;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht1 extends Show {
    TextField tekstVak;
    Button knop;
    int b,y,m, a;
    String s;


    public void init() {
        setSize(1000,1000);
        tekstVak = new TextField(10);
        knop = new Button("Ok");
        add(tekstVak);
        add(knop);
        knop.addActionListener(new KnopListener());

    }




    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            s = tekstVak.getText();
            m = Integer.parseInt(s);
            repaint();
        }
    }
    public void paint(Graphics g) {
        switch (m){
            case 1:
                y = 10;
                a =1;
                for (int i=0; i<10; i++) {
                    b = a * 1;
                    g.drawString(a + " * 1 = " + b, 20,y);
                    a+=1;
                    y+=20;
                }
                break;
            case 2:
                y = 10;
                a =1;
                for (int i=0; i<10; i++) {
                    b = a * 2;
                    g.drawString(a + " * 2 = " + b, 20,y);
                    a+=1;
                    y+=20;
                }
                break;
            case 3:
                y = 10;
                a =1;
                for (int i=0; i<10; i++) {
                    b = a * 3;
                    g.drawString(a + " * 3 = " + b, 20,y);
                    a+=1;
                    y+=20;
                }
                break;
            case 4:
                y = 10;
                a =1;
                for (int i=0; i<10; i++) {
                    b = a * 4;
                    g.drawString(a + " * 4 = " + b, 20,y);
                    a+=1;
                    y+=20;
                }
                break;
            case  5:
                y = 10;
                a =1;
                for (int i=0; i<10; i++) {
                    b = a * 5;
                    g.drawString(a + " * 5 = " + b, 20,y);
                    a+=1;
                    y+=20;
                }
                break;
            case 6:
                y = 10;
                a =1;
                for (int i=0; i<10; i++) {
                    b = a * 6;
                    g.drawString(a + " * 6 = " + b, 20,y);
                    a+=1;
                    y+=20;
                }
                break;
            case 7:
                y = 10;
                a =1;
                for (int i=0; i<10; i++) {
                    b = a * 7;
                    g.drawString(a + " * 7 = " + b, 20,y);
                    a+=1;
                    y+=20;
                }
                break;
            case 8:
                y = 10;
                a =1;
                for (int i=0; i<10; i++) {
                    b = a * 8;
                    g.drawString(a + " * 8 = " + b, 20,y);
                    a+=1;
                    y+=20;
                }
                break;
            case 9:
                y = 10;
                a =1;
                for (int i=0; i<10; i++) {
                    b = a * 9;
                    g.drawString(a + " * 9 = " + b, 20,y);
                    a+=1;
                    y+=20;
                }
                break;
            case 10:
                y = 10;
                a =1;
                for (int i=0; i<10; i++) {
                    b = a * 10;
                    g.drawString(a + " * 10 = " + b, 20,y);
                    a+=1;
                    y+=20;
                }
                break;

        }

    }
}


