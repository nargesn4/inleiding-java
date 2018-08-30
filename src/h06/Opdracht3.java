package h06;

import h01.Show;

import java.awt.*;

public class Opdracht3 extends Show {
    int a, b, uitkomst;


    public void init() {
        a = 2000000000;
        b = 2000000000;
        uitkomst = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
