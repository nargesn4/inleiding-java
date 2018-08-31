package h06;

import h01.Show;

import java.awt.*;

public class PraktijkOpdracht extends Show{
    double gemiddeld;
    int gemiddeld2;
    double getGemiddeld3;
    double laatstegemiddeld;

    public void init() {
      gemiddeld = (5.9+ 6.3+ 6.9)/3;
      gemiddeld2 = (int)(gemiddeld *10);
      getGemiddeld3 = gemiddeld2;
      laatstegemiddeld = getGemiddeld3/10;
    }


    public void paint(Graphics g) {
       g.drawString("Het gemiddelde is: "+laatstegemiddeld, 20, 50);
    }

}
