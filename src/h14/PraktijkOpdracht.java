package h14;

import h01.Show;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Show {
    Button knop, speel;
    TextField tekstVak;
    Label label;
    int lucifers,getal;
    String tekst=" ";
    String s;
    boolean show;


    public void init() {
        lucifers =23;
       knop= new Button("Start spel");
       knop.setBackground(Color.red);
       add(knop);
       knop.addActionListener(new KnopListener1());
       show=false;
        tekstVak = new TextField(20);
        label = new Label("Hoeveel lucifers neem je (één, twee of drie)? ");
        speel = new Button("Speel");
       speel.addActionListener(new Knoplistener());
    }

    public void paint(Graphics g) {
        setSize(1000,1000);
        if(show==true){
          for(int i = 0 ; i <lucifers ; i++)
          {
            g.setColor(new Color(106, 53, 0));	// teken het stokje
            g.fillRect((i+1) * 20, 80, 3, 75);

            g.setColor(new Color(255, 0, 0));	// teken het lucifer kopje
            g.fillOval(( (i+1) * 20) -3, 71, 9, 9);

            g.setColor(Color.black);
            g.drawString(" " + (i+1), ( (i+1) * 20) -3, 175);
          }
          g.drawString(tekst,20,60);
        }
    }
    class KnopListener1 implements ActionListener{
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
            show=true;
            //while((lucifers>0) && (lucifers<=23))
            playHuman();
        }

    }
    public void playComputer() {

        int turn = (lucifers% 4) +1;

        if (turn > 0) {
            lucifers -= turn;
            tekst = "De computer heeft "+turn+" lucifers weggehaald. Aantal resterende lucifers: "+lucifers+". Jouw beurt";
        }repaint();
    }
    public void playHuman() {
        s = tekstVak.getText();
        getal=Integer.parseInt(s);

            if ((getal > 3)||(getal<1)) {
                tekst = "You can pick 1,2 or 3 sticks";
                repaint();
            }
            if ((lucifers - getal) == 0) {
                tekst = "You lose";
            }
            if (getal == 1) {
                lucifers--;
                playComputer();
                repaint();
            }
            if (getal == 2) {
                lucifers -= 2;
                playComputer();
                repaint();
            }
            if (getal == 3) {
                lucifers -= 3;
                playComputer();
                repaint();
            }
    }
}
