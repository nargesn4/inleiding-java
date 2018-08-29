package h01;
import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.blue);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Welcome to Java narges!!", 100, 60 );

    }

}

