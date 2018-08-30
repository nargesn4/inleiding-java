package h04;

import h01.Show;

import java.awt.*;

public class PraktijkOpdracht extends Show {
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(5, 20, 180, 20);
        g.drawRect(5, 50, 180, 80);
        g.drawRoundRect(5, 180, 180, 80,30,30);
        g.drawOval(385,50,180,80);
        g.drawOval(420,180,80,80);
        g.setColor(Color.magenta);
        g.fillRect(195, 50, 180, 80);
        g.fillOval(195,180,180,80);
        g.fillArc(385, 50, 180, 80, 0, 45);
        g.setColor(Color.black);
        g.drawOval(195,50,180,80);
        g.drawString("Lijn" , 80,40);
        g.drawString("Rechthoek" , 50,150);
        g.drawString("Gevulde rechthoek met oval" , 210,150);
        g.drawString("Taartpunt met oval eromheen" , 385,150);
        g.drawString("Afgeronde rechthoek" , 30,280);
        g.drawString("Gevulde oval" , 240,280);
        g.drawString("Cirkel" , 440,280);
    }
}
