package h13;


import h01.Show;
import java.awt.*;
import java.awt.Graphics;

public class Opdracht2 extends Show {

    int startX;
    int startY;
    int width;
    int height;
    int spacing;
    Color color;


    public void init() {

    }

    public void paint(Graphics g) {

        roodMuurMaker(0,20,2,0,50);
    }
    public void roodMuurMaker  (int startY, int height, int spacing, int startX,int width){

        for (int row = 0; row < 8; row++) {

            int y = startY + (row * (height + spacing));
            for (int col = 0; col < 8; col++) {
                int x = startX + (col * (width + spacing));
                getGraphics().setColor(Color.red);
                getGraphics().fillRect(x, y, width, height);
            }

        }
    }


}
