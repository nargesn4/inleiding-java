package h11;

import h01.Show;

import java.awt.*;

public class Opdracht6 extends Show {
    int x, y, width, height;

    public void init() {
        x = 100;
        y = 100;
        width = 20;
        height = 20;
    }


    public void paint(Graphics g) {
        for (int i = 0; i < 5; i++) {
            g.drawOval(x,y, width, height);
            width+=20;
            height+=20;
            x-=10;
            y-=10;
        }
    }
}
