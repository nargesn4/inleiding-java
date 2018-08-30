package h06;

import h01.Show;

import java.awt.*;

public class Opdracht1 extends Show {
    double total, uitkomst;


    public void init() {
        total = 113;
        uitkomst = total / 4;
    }

    public void paint(Graphics g) {
        g.drawString("Jan = " + uitkomst, 20, 20);
        g.drawString("Ali = " + uitkomst, 20, 40);
        g.drawString("Jeannette = " + uitkomst, 20, 60);
        g.drawString("Narges = " + uitkomst, 20, 80);
    }
}
