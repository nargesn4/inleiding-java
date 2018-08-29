package h04;

import h01.Show;

import java.awt.*;

public class Dice extends Show {


    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(30, 110, 200, 200);
        g.setColor(Color.black);
        g.fillOval(60, 130, 60, 60);
        g.fillOval(140, 130, 60, 60);
        g.fillOval(60, 235, 60, 60);
        g.fillOval(140, 235, 60, 60);
    }

}