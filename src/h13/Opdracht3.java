package h13;

import h01.Show;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Show {
    Button knop1, knop2;
    boolean rood, grijz;
    int startY, height, spacing, startX, width;

    public void init() {
        knop1= new Button("muur met rode bakstenen");
        knop2= new Button("muur met grijze betonblokken");
        add(knop1);
        add(knop2);
        knop1.addActionListener(new knopListener1());
        knop2.addActionListener(new knopListener2());
        rood = false;
        grijz= false;
        startY =0;
        spacing =2;
        startX = 0;
    }
    public void paint(Graphics g) {
        if (rood==true){
            roodMuurMaker(g);
        }else if (grijz==true){
            grijzeMuurMaker(g);
        }else {
            g.drawString("druk op een knop",20,60);
        }

    }
    class knopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            grijz=false;
            rood = true;
            repaint();
        }
    }
    class knopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            rood =false;
            grijz=true;
            repaint();
        }
    }
    void roodMuurMaker (Graphics g) {

        height=20;
        width = 50;
        for (int row = 0; row < 8; row++) {

            int y = startY + (row * (height + spacing));
            for (int col = 0; col < 8; col++) {
                int x = startX + (col * (width + spacing));
                g.setColor(Color.red);
                g.fillRect(x, y, width, height);
            }

        }
    }
    void grijzeMuurMaker (Graphics g){
        height = 40;
        width = 100;

        for (int row = 0; row < 8; row++) {

            int y = startY + (row * (height + spacing));
            for (int col = 0; col < 8; col++) {
                int x = startX + (col * (width + spacing));
                g.setColor(Color.gray);
                g.fillRect(x, y, width, height);
            }

        }
    }
}
