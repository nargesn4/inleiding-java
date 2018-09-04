package h11;

import h01.Show;

import java.awt.*;

public class Opdracht7 extends Show {
    int x, y, width, height;

    public void init() {
        x = 200;
        y = 200;
        width = 5;
        height = 5;
    }


    public void paint(Graphics g) {
        for (int i = 0; i < 50; i++) {
            g.drawOval(x,y, width, height);
            width+=20;
            height+=20;
            x-=10;
            y-=10;
        }
    }
}
