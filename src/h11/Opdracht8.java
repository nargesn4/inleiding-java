package h11;

import h01.Show;

import java.awt.*;

public class Opdracht8 extends Show {
    int x, y, width, height;

    public void init() {
        x = 100;
        y = 100;
        width = 20;
        height = 20;
    }


    public void paint(Graphics g) {
        for (int i = 0; i < 100; i++) {
            g.drawOval(x,y, width, height);
            width+=5;
            height+=5;

        }
    }
}
