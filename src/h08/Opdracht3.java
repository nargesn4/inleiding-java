package h08;

import h01.Show;

import java.awt.*;
import java.awt.event.*;
/*Maak een applet waarin een tekstvak met label en een knop Ok staan. In het tekstvak moet een bedrag worden ingevuld
 en zodra de gebruiker op Ok klikt of op de enter-toets drukt moet de prijs inclusief BTW (= 21%) in het venster geplaatst worden.
  */

public class Opdracht3 extends Show implements KeyListener{
    TextField tekstvak;
    Label label;
    Button knop;
    double getal;
    double metBTW;
    String m;

    public void init() {
        m ="";
        tekstvak = new TextField("",20);
        label = new Label("type het bedrag hier en druk op Ok");
        knop = new Button("Ok");
        add(label);
        add(tekstvak);
        add(knop);
        knop.addActionListener( new KnopListener());
        tekstvak.addKeyListener(this);


    }

    public void paint(Graphics g) {
        g.drawString(m,20,80);

    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2();
        }
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            s2();
        }
    }

    private void s2() {
        String s = tekstvak.getText();
        getal = Double.parseDouble( s );
        metBTW = ((21*getal)/100)+getal;
        m = "Het bedrag inclusif 21% BTW is: "+metBTW;
        repaint();
    }
}
