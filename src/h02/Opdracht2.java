package h02;

import h01.Show;

import java.awt.*;

public class Opdracht2 extends Show {
    public void init() {
        setBackground(Color.white);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Narges", 100, 40 );
        g.setColor(Color.red);
        g.drawString("Jafari", 100, 60 );
    }
}
