package h11;

import h01.Show;

import java.awt.*;

public class Opdracht2 extends Show {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 20; teller >=10; teller--) {
            y += 20;
            g.drawString(""+ teller, 200, y);
        }
    }
}
