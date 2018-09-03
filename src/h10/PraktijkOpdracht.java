package h10;

import h01.Show;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Show {
    TextField tekstVak;
    Label label;
    String s,m;
    int cijfer;


    public void init() {
        tekstVak = new TextField("",10);
        label = new Label("Type je cijfer in :");
        add(label);
        add(tekstVak);
        m = "";
        tekstVak.addActionListener(new TekstVakListener());

    }


    public void paint(Graphics g) {
       g.drawString(m,20,60);
    }
     class TekstVakListener implements ActionListener {

         public void actionPerformed(ActionEvent e) {
             s = tekstVak.getText();
             cijfer = Integer.parseInt(s);
             if ((cijfer>=0)&& (cijfer<=3)){
              m = "Het is slecht";
             }
             else if (cijfer==4){
                 m = "Het is onvoldoende";
             }
             else if (cijfer==5){
                 m = "Het is matig";
             }
             else if ((cijfer==6)||(cijfer==7)){
                 m = "Het is onvoldoende";
             }
             else if ((cijfer==8)||(cijfer==9)||(cijfer==10)){
                 m = "Het is goed ";
             }
             else {
                 m = "je hebt een verkeerd cijfer ingevoerd";
             }
             repaint();
         }
     }
}
