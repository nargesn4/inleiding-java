package h05;

import h01.Show;

import java.awt.*;

public class PraktijkOpdracht5 extends Show {
    Color opvulkleur;
    Color lijnkleur;
    Color backgroundcolor;
    int breedte;
    int hoogte;
    public void init() {
        backgroundcolor = Color.WHITE;
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 180;
        hoogte = 80;
    }
    public void paint(Graphics g) {
        setBackground(backgroundcolor);
        g.drawLine(5, 20, breedte, 20);
        g.drawRect(5, 50, breedte, hoogte);
        g.drawRoundRect(5, 180, breedte, hoogte,30,30);
        g.drawOval(385,50,breedte,hoogte);
        g.drawOval(420,breedte,80,hoogte);
        g.setColor(opvulkleur);
        g.fillRect(195, 50, breedte, hoogte);
        g.fillOval(195,breedte,breedte,hoogte);
        g.fillArc(385, 50, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawOval(195,50,breedte,hoogte);
        g.drawString("Lijn" , 80,40);
        g.drawString("Rechthoek" , 50,150);
        g.drawString("Gevulde rechthoek met oval" , 210,150);
        g.drawString("Taartpunt met oval eromheen" , 385,150);
        g.drawString("Afgeronde rechthoek" , 30,280);
        g.drawString("Gevulde oval" , 240,280);
        g.drawString("Cirkel" , 440,280);
    }
}
