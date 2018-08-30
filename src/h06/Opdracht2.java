package h06;

import h01.Show;

import java.awt.*;

public class Opdracht2 extends Show {
    int seconden;
    int eenminut;
    int eenuur;
    int eendag;
    int eenjaar;

    public void init() {
     seconden = 1;
     eenminut = seconden *60;
     eenuur = eenminut*60;
     eendag = eenuur*24;
     eenjaar = eendag*365;
    }


    public void paint(Graphics g) {
        g.drawString("Er zitten "+ eenuur +" seconden in een uur",20,20);
        g.drawString("Er zitten "+ eendag +" seconden in een dag",20,40);
        g.drawString("Er zitten "+ eenjaar +" seconden in een jaar",20,60);
    }
}
