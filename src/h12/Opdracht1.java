package h12;

import h01.Show;

import java.awt.*;

public class Opdracht1 extends Show {
    double salaris[]={20,30,98,799,67,99,77,45,60,87};
    double total,gemiddeld,result;

    public void init() {

         result = 0;

        for( int i = 0; i < salaris.length; i++ )
        {
            result += salaris[i];
        }


    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        }
        g.drawString("Het gemmidelde is: "+(result/10), 50, 220);
    }
}
