package h12;

import h01.Show;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Show{
    int array[] = {0,1,2,3,4,5,6,7,8,9,10,1,2,3,2,4,5,10};
    TextField tekstVak;
    Label label;
    String s;
    int m,counter;



    public void init() {
        tekstVak = new TextField(10);
        label = new Label("type een waarde tussen 0 en 10");
        add(label);
        add(tekstVak);
        tekstVak.addActionListener(new TekstVakListener());
    }


    public void paint(Graphics g) {
        g.drawString("Het getal is "+ counter+" gevonden",20,80);
    }
    class TekstVakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstVak.getText();
            m = Integer.parseInt(s);
            counter=0;
            for (int i=0; i<array.length; i++){
                if(m==array[i]){
                   counter=counter+1;
                }
            }repaint();

        }
    }
}
