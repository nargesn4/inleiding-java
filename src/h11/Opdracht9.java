package h11;

import h01.Show;

import java.awt.*;

public class Opdracht9 extends Show {

    public void init() {
    }

    public void paint(Graphics g) {

        int boxWidth = 40;

        boolean blackSquare = true;

        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (blackSquare) g.setColor(Color.black);
                else g.setColor(Color.white);

                blackSquare = !blackSquare;

                g.fillRect((x * boxWidth), (y * boxWidth), boxWidth, boxWidth);
            }
            blackSquare = !blackSquare;
        }
    }

}


