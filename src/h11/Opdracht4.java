package h11;

import h01.Show;

import java.awt.*;

public class Opdracht4 extends Show {
    int a,b,y;


    public void init() {
        a =0;
        y = 20;

    }


    public void paint(Graphics g) {
        for (int i=0; i<11; i++) {
            b = a * 3;
            g.drawString(a + " * 3 = " + b, 20,y);
            a += 1;
            y+=20;
        }
    }
}
