package h04;
import h01.Show;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Show {

    public void paint (Graphics g) {
        //Opdracht 4.1 Teken een gelijkbenige driehoek
        setBackground(Color.white);
        g.setColor(Color.yellow);
        g.drawPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);

        // Opdracht 4.2 Teken een huis met daarin tenminste één raam en een deur
        g.setColor(Color.black);
        g.drawRect(100, 100, 200, 100);


        g.drawLine(80, 100, 320, 100);
        g.drawLine(80, 100, 200, 40);
        g.drawLine(200, 40, 320, 100);

        g.fillRect(180, 130, 40, 70);
        g.fillRect(120, 130, 40, 40);
        g.fillRect(240, 130, 40, 40);


        //Opdracht 4.3 Teken de Nederlandse vlag aan een vlaggenstok

        g.setColor(Color.black);

        g.fillRect(337,114,10,500);

        g.setColor(Color.red);

        g.fillRect(348,125,200,25);

        g.setColor(Color.white);

        g.fillRect(348,150,200,25);

        g.setColor(Color.blue);

        g.fillRect(348,175,200,25);


        //Opdracht 4.6  Teken een stoplicht

        g.setColor(Color.black);//pole top
        g.fillRect(650,150,50,150);
        g.drawRect(650,150,50,150);
        g.setColor(Color.black);//POLE DOWN
        g.fillRect(665,300,20,155);
        g.drawRect(665,300,20,155);
        g.setColor(Color.red);
        g.fillOval(650,150,50,50);//RED
        g.setColor(Color.yellow);
        g.fillOval(650,200,50,50);//YELLOW
        g.setColor(Color.green);
        g.fillOval(650,250,50,50);//GREEN





    }


}

