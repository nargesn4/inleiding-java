package h14;

import h01.Show;

import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;

public class Opdracht2 extends Show {
    private URL pad;
    private AudioClip sound;
    Button knop;
    boolean Ok=false;
    String[] deck= new String[52];
    String[] speler1 =new String[13];
    String[] speler2 = new String[13];
    String[] speler3 = new String[13];
    String[] speler4 = new String[13];


    public void init() {
        knop = new Button("Dell kaart");
        knop.setBackground(Color.red);
        add(knop);
        knop.addActionListener(new KnopListener());
        pad = Opdracht2.class.getResource("/resources/");
        sound = getAudioClip(pad, "scream.wav");
        String[] kleuren = {"schoppen", "ruiten", "klaveren", "Harten"};
        String[] kaarten = {"Twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "vrouw", "ass", "boer", "heer"};

        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < kleuren.length; j++) {
                for (int x = 0; x < kaarten.length; x++) {
                    deck[i] = kleuren[j] + kaarten[x];
                    i++;
                }
            }
        }

        for (int i = 0; i < 13; i++) {
            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart();
        }
    }


    public void paint(Graphics g) {
        if (Ok==true){
            g.drawString("Speler 1: "+Arrays.toString(speler1),20,60);
            g.drawString("Speler 2: "+Arrays.toString(speler2),20,80);
            g.drawString("Speler 3: "+Arrays.toString(speler3),20,100);
            g.drawString("Speler 4: "+Arrays.toString(speler4),20,120);
        }

    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Ok = true;
            repaint();
            sound.play();
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];


        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }
}
