package h04;

import h01.Show;

import java.awt.*;

public class Ellipse extends Show {
    public void paint(Graphics g)
    {   setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(70, 90, 140, 100,90,360);
    }
}