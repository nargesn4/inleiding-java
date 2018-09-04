package h12;

import h01.Show;

import java.awt.*;

public class Opdracht2 extends Show {
     Button[] knop;

    public void init() {
        knop = new Button[25];
        for (int teller = 0; teller < knop.length; teller ++) {
            knop[teller]= new Button("ok");
            add(knop[teller]);
        } repaint();
    }
    public void paint(Graphics g) {

    }
}
