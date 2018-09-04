package h11;

import h01.Show;

import java.awt.*;

public class Opdracht5 extends Show {
    int x, y;

    public void init() {
        x = 20;
        y = 20;
    }


    public void paint(Graphics g) {
        for (int i = 0; i < 5; i++) {
            g.drawRect(x, y, 40, 40);
            x+=40;
            y+=40;

        }
    }
}
