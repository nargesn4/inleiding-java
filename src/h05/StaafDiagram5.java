package h05;

import h01.Show;

import java.awt.*;

public class StaafDiagram5 extends Show{
    Color backgroundColor;
    Color lijnColor;
    Color gewigtColor;
    int valeriGewicht;
    int jeroenGewicht;
    int hansGewicht;

    public void init() {
        backgroundColor = Color.white;
        lijnColor = Color.black;
        gewigtColor = Color.blue;
        valeriGewicht = 40;
        jeroenGewicht = 100;
        hansGewicht = 80;

    }

    public void paint(Graphics g) {
        setBackground(backgroundColor);

        g.setColor(Color.red);
        g.fillRect(0, 200, valeriGewicht+100, 50);
        g.setColor(gewigtColor);
        g.drawString(valeriGewicht+"kg",10, 240);
        g.setColor(lijnColor);
        g.drawString("Valerie" , 0, 270);

        g.setColor(Color.orange);
        g.fillRect(0,40, jeroenGewicht+100, 50);
        g.setColor(gewigtColor);
        g.drawString(jeroenGewicht+"kg",10,80);
        g.setColor(lijnColor);
        g.drawString("Jeroen" , 0,100);

        g.setColor(Color.magenta);
        g.fillRect(0,120,hansGewicht+100, 50);
        g.setColor(gewigtColor);
        g.drawString(hansGewicht+"kg",10,160);
        g.setColor(lijnColor);
        g.drawString("Hans" , 0,180);
    }

}
