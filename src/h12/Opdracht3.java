package h12;

import h01.Show;

import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Show {
    TextField[] tekstVak;
    Button knop;
    String s1, s2, s3, s4, s5;
    int m1, m2, m3, m4, m5, teller,r[];

    public void init() {
        knop = new Button("Ok");
        tekstVak = new TextField[5];
        for (teller = 0; teller < tekstVak.length; teller++) {
            tekstVak[teller] = new TextField("", 10);
            add(tekstVak[teller]);
        }
        add(knop);
        knop.addActionListener(new KnopListener());
    }
    public void paint(Graphics g) {
        int x = 20;
        int y = 80;
        g.drawString("Data items in ascending order", x, y);
        x = 20;
        y = 100;
       for(int i=0; i<r.length; i++) {
           g.drawString("" + r[i], x, y);
           x += 20;
       }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s1 = tekstVak[0].getText();
            m1 = Integer.parseInt(s1);
            s2 = tekstVak[1].getText();
            m2 = Integer.parseInt(s2);
            s3 = tekstVak[2].getText();
            m3 = Integer.parseInt(s3);
            s4 = tekstVak[3].getText();
            m4 = Integer.parseInt(s4);
            s5 = tekstVak[4].getText();
            m5 = Integer.parseInt(s5);
            r = new int[5];
            r[0]=m1;
            r[1]=m2;
            r[2]=m3;
            r[3]=m4;
            r[4]=m5;
            int i,j,t;
            for(i=0;i<5;i++)
            {
                for(j=0;j<5;j++)
                {
                    if(r[i]<r[j]){
                        if(r[i]<r[j]){
                            t=r[i];
                            r[i]=r[j];
                            r[j]=t;
                        }
                    }
                }
            }
            repaint();
        }
    }
}


