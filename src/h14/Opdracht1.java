package h14;

import h01.Show;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Graphics;

public class Opdracht1 extends Show {
    String[] kleuren ={"schoppen", "ruiten", "klaveren", "Harten"};
    String[] kaarten ={"Twee","drie","vier","vijf","zes","zeven","acht","negen","tien","vrouw","ass","boer","heer"};
    Button deelKaart;
    String geselectedColor, geselectedKaart;
    String tekst;
    public void init() {
        deelKaart = new Button("Deel Kaart");
        deelKaart.setBackground(Color.red);
        add(deelKaart);
        deelKaart.addActionListener(new KnopListener());
        tekst="";
    }
    public void paint(Graphics g) {
          g.drawString(tekst,20,80);
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Random random = new Random();
            geselectedColor = kleuren[random.nextInt(kleuren.length)];
            geselectedKaart = kaarten[random.nextInt(kaarten.length)];
            tekst=geselectedColor+" "+geselectedKaart;
            repaint();
        }
    }

}
