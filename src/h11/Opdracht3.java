package h11;

import h01.Show;

import java.awt.*;

public class Opdracht3 extends Show {
    /*Geef de rij van Fibonacci. De eerste twee getallen van de rij zijn 1 en de volgende zijn de som van de twee voorgangers.
1, 1, 2, 3, 5, 8, 13, 21, en zo voort...*/

   int eersteCijfer, tweedecifer, cifer, y;

    public void init() {
     eersteCijfer=0;
     tweedecifer=1;
     y=20;
    }


    public void paint(Graphics g) {
        for(int teller=0; teller<50; teller++){
            cifer=eersteCijfer+tweedecifer;
            g.drawString(""+cifer,20,y);
            y+=20;
            tweedecifer = eersteCijfer;
            eersteCijfer=cifer;

        }

    }
}