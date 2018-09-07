package h14;

import h01.Show;

import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.net.URL;


public class Opdracht2 extends Show {
    private URL pad;
    private AudioClip sound;
    Button knop;
    Boolean Ok=false;
    String tekst;
    String deck1[] = {"schoppen twee", "schoppen drie", "schoppen vier", "schoppen vijf", "schoppen sez", "schoppen zeven", "schoppen acht", "schoppen negen",
            "schoppen tien", "schoppen ass", "schoppen vrouw", "shoppen heer", "schoppen boer", "harten twee", "harten drie", "harten vier", "harten vijf", "harten sez",
            "harten zeven", "harten acht", "harten negen", "harten tien", "harten ass", "harten vrouw", "harten heer", "harten boer", "ruiten twee", "ruiten drie",
            "ruiten vier", "ruiten vijf", "ruiten sez", "ruiten zeven", "ruiten acht", "ruiten negen", "ruiten tien", "ruiten ass", "ruiten vrouw", "ruiten heer",
            "ruiten boer", "klaveren twee", "klaveren drie", "klaveren vier", "klaveren vijf", "klaveren sez", "klaveren zeven", "klaveren acht", "klaveren negen",
            "klaveren tien", "klaveren ass", "klaveren vrouw", "klaveren heer", "klaveren boer"};
    String deck2[];
    String deck3[];


    public void init() {
        pad = Opdracht2.class.getResource("/resources/");
        sound = getAudioClip(pad, "scream.wav");

        knop =new Button("Deel kaart");
        add(knop);
        tekst="";
        displayspeler1();
        displayspeler2();
        displayspeler3();

        String speler4 = " Speler 4 : ";
        for (int i = 0; i < 13; i++) {
            int random = new Random().nextInt(deck3.length);
            speler4 += deck3[random] + "- ";
        }
        tekst=speler4;
        knop.addActionListener(new KnopListener());
    }


    public void paint(Graphics g) {

        if (Ok==true){
        g.drawString(displayspeler1(), 20, 80);
        g.drawString(displayspeler2(), 20, 100);
        g.drawString(displayspeler3(), 20, 120);
        g.drawString(tekst,20,140);
        sound.play();
        }


    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Ok =true;
            repaint();
        }
    }

    public String displayspeler1() {

        String speler1 = " Speler 1 : ";

        for (int i = 0; i < 13; i++) {
            int random = new Random().nextInt(deck1.length);
            speler1 += deck1[random] + "- ";
            String deck2[] = new String[deck1.length - 1];
            int hulpindex = 0;
            for (int j = 0; j < deck1.length; j++) {
                if (j != random) {
                    deck2[hulpindex] = deck1[j];
                    hulpindex++;
                }
            }
            deck1 = deck2;
        }
        deck2 = deck1;
        //System.out.println(Arrays.toString(deck2));
        return speler1;
    }

    public String displayspeler2() {

        String speler2 = " Speler 2 : ";

        for (int i = 0; i < 13; i++) {
            int random = new Random().nextInt(deck2.length);
            speler2 += deck2[random] + "- ";
            deck3 = new String[deck2.length - 1];
            int hulpindex = 0;
            for (int j = 0; j < deck2.length; j++) {
                if (j != random) {
                    deck3[hulpindex] = deck2[j];
                    hulpindex++;
                }
            }
            deck2 = deck3;
        }
        deck3 = deck2;
        //System.out.println(Arrays.toString(deck3));
        return speler2;
    }

    public String displayspeler3() {

        String speler3 = " Speler 3 : ";

        for (int i = 0; i < 13; i++) {
            int random = new Random().nextInt(deck3.length);
            speler3 += deck3[random] + "- ";
            String speler4[] = new String[deck3.length - 1];
            int hulpindex = 0;
            for (int j = 0; j < deck3.length; j++) {
                if (j != random) {
                    speler4[hulpindex] = deck3[j];
                    hulpindex++;
                }
            }
            deck3 = speler4;
        } return speler3;
    }



}


