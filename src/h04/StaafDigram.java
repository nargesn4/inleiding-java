package h04;

import h01.Show;

import java.awt.*;

public class StaafDigram extends Show {

    public void init() {
    }

    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(50, 150, 40, 100);
        g.setColor(Color.BLUE);
        g.drawString("40kg",20, 175);
        g.setColor(Color.black);
        g.drawString("Valerie" , 50, 270);
        g.setColor(Color.pink);
        g.fillRect(150,50, 40, 200);
        g.setColor(Color.BLUE);
        g.drawString("100kg",115,175);
        g.setColor(Color.black);
        g.drawString("Jeroen" , 150,270);

        g.setColor(Color.blue);
        g.fillRect(250,80, 40, 170);
        g.setColor(Color.BLUE);
        g.drawString("80kg",220,175);
        g.setColor(Color.black);
        g.drawString("Hans" , 252,270);
    }

}


/* <applet code=BarChart width=400 height=400>
 <param name=c1 value=110>
 <param name=c2 value=150>
 <param name=c3 value=100>
 <param name=c4 value=170>
 <param name=label1 value=1991>
 <param name=label2 value=1992>
 <param name=label3 value=1993>
 <param name=label4 value=1994>
 <param name=Columns value=4>
</applet>
*/

