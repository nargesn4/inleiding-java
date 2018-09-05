package h12;

import h01.Show;

import java.awt.*;
import java.awt.event.*;
public class Opdracht4 extends Show {
        boolean gevonden;
        int[] getallen ;
       int gezocht, index;
       TextField tekstVak;
       Label label;
       Button knop;
       String s, tekst;



        public void init() {
            getallen = new int[10];
            for (int teller = 0; teller <getallen.length; teller ++){
               getallen[teller] = teller ;}
            tekstVak = new TextField(10);
            label = new Label("type een getal tussen 1 en 10 en druk op ok:");
            knop = new Button("Ok");
            add(label);
            add(tekstVak);
            add(knop);
            knop.addActionListener(new KnopListener());
            gevonden = false;
        }

        public void paint(Graphics g) {
            int teller = 0;
            while(teller < getallen.length) {
                if(getallen[teller] == gezocht) {
                    gevonden = true;
                    index =getallen[teller];
                }
                teller ++;
            }
            if(gevonden == true) {
                g.drawString("De waarde is gevonden at index " + index, 20, 150);
            }
            else {
                g.drawString("De waarde is niet gevonden.", 20, 150);
            }

         }
        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                s =tekstVak.getText();
                gezocht = Integer.parseInt(s);
                repaint();

            }
        }

}
