package h14;

import h01.Show;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PraktijkOpdracht extends Show {
    Button knop, speel;
    TextField tekstVak;
    Label label;
    int lucifers, getal, computergetal;
    String tekst = " ";
    String s;
    boolean show;


    public void init() {
        lucifers = 23;
        knop = new Button("Start spel");
        knop.setBackground(Color.red);
        add(knop);
        knop.addActionListener(new KnopListener1());
        show = false;
        tekstVak = new TextField(20);
        label = new Label("Hoeveel lucifers neem je (één, twee of drie)? ");
        speel = new Button("Speel");
        speel.addActionListener(new Knoplistener());
    }

    public void paint(Graphics g) {
        setSize(1000, 1000);
        if (show == true) {
            for (int i = 0; i < lucifers; i++) {
                g.setColor(new Color(106, 53, 0));    // teken het stokje
                g.fillRect((i + 1) * 20, 80, 3, 75);

                g.setColor(new Color(255, 0, 0));    // teken het lucifer kopje
                g.fillOval(((i + 1) * 20) - 3, 71, 9, 9);

                g.setColor(Color.black);
                g.drawString(" " + (i + 1), ((i + 1) * 20) - 3, 175);
            }
            g.drawString(tekst, 20, 60);
        }
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            remove(knop);
            add(label).revalidate();
            add(tekstVak).revalidate();
            add(speel).revalidate();
            show = true;
            repaint();

        }
    }

    class Knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            show = true;
            playHuman();
        }

    }

    public void playComputer() {
        if (lucifers <= 0) {
           eindGame();
        }
        else {
            int random1[] = {1, 2, 3};
            int random = new Random().nextInt(random1.length);
            int random2=random;
            int turn = lucifers % 4;
            switch (turn) {

            case 0:
                lucifers -= 3;
                computergetal=3;
                break;
            case 1:
                lucifers -= random2;
                computergetal=random2;
            case 2:
                lucifers -= 1;
                computergetal=1;
                break;
            case 3:
                lucifers -= 2;
                computergetal=2;
                break;
        }
        tekst = "De computer heeft " + computergetal + " lucifers weggehaald. Aantal resterende lucifers: " + lucifers + ". Jouw beurt";
        repaint();
        }
    }

    public void playHuman() {
        s = tekstVak.getText();
        getal = Integer.parseInt(s);
        if ((getal > 3) || (getal < 1)) {
            tekst = "You can pick 1,2 or 3 sticks";
            tekstVak.setText("");
            repaint();
        }
         else if (lucifers-getal<=0) {
            lucifers-=getal;
            eindGame();
        }else if ((getal == 1) || (getal == 2) || (getal == 3)) {
            switch (getal) {
                case 1:
                    lucifers--;
                    break;
                case 2:
                    lucifers -= 2;
                    break;
                case 3:
                    lucifers -= 3;
                    break;
            }tekstVak.setText("");
            playComputer();
            repaint();
        }

    }
    public void eindGame(){
        tekst="you lose";
        repaint();
    }
}

