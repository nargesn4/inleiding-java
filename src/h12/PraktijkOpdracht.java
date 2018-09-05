package h12;

import h01.Show;

import java.awt.*;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Show {
    TextField tekstVak1;
    TextField tekstVak2;
    Button OK;
    Label label1;
    Label label2;
    String [] namenArray = new String[10];
    String [] numbersArray = new String[10];
    int numNamen, numNumbers;                     //  counts number of namen en numbers entered by User
    String userNamen, userNumbers;                  //  holds input value from User
    boolean done1 = false;
    boolean done2 = false;
    boolean knop = false;

    public void init() {
        tekstVak1 = new TextField(20);
        tekstVak2 = new TextField(20);
        label1 = new Label("voer hier de namen in :");
        label2 = new Label("voer hier de telefoon nummers in :");
        add(label1);
        add(tekstVak1);
        add(label2);
        add(tekstVak2);
        OK = new Button("Ok");
        add(OK);
        tekstVak1.addActionListener(new TekstVakListener1());
        tekstVak2.addActionListener(new TekstVakListener2());
        OK.addActionListener(new knopListener());

    }


    public void paint(Graphics g) {
        if( done1 == true){
            g.drawString("je hebt 10 namen ingevoerd. ", 20,100);
            //g.drawString("The namen you entered are :  "  + displayNamen(namenArray, 10), 20,100);
            g.drawString("Nu voer the telefoonNummers in. ",20,120);
        }
        if( done2 == true){

            g.drawString("Je hebt 10 numbers ingevoerd. nu druk op Ok. ", 20,140);
        }
        if( knop== true){

            g.drawString("The namen you entered are :  "  + displayNamen(namenArray, 10), 20,160);
            g.drawString("The numbers you entered are :  "  + displayNumbers(numbersArray, 10), 20,180);
        }


    }
    class TekstVakListener1 implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            userNamen = tekstVak1.getText();        // get string user typed
            tekstVak1.setText("");           // clear text field for next entry

            if ( numNamen < 10 )   {

                namenArray[numNamen] = userNamen;
                numNamen++;

            }
            else {

                done1 = true;
            }
            repaint();

        }
    }
    class TekstVakListener2 implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            userNumbers = tekstVak2.getText();        // get string user typed
            tekstVak2.setText("");           // clear text field for next entry

            if ( numNumbers < 10 )   {

                numbersArray[numNumbers] = userNumbers;
                numNumbers++;

            }
            else {

                done2 = true;
            }
            repaint();

        }
    }
    public String displayNamen(String b_namenArray[],  int length) {   // not a length of array, but entries by user

        int count = 0;
        String namen= "";

        for(int i = 0;  i < length;  i++)  {

            namen = namen +" "+ b_namenArray[i];   // incrementally capture user input from each index
            count++;

        }

        return namen;
    }
    public String displayNumbers(String b_numbersArray[],  int length) {   // not a length of array, but entries by user

        int count = 0;
        String numbers= "";

        for(int i = 0;  i < length;  i++)  {

            numbers = numbers +" "+ b_numbersArray[i];   // incrementally capture user input from each index
            count++;

        }

        return numbers;
    }
    class knopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            knop =true;
            repaint();
        }
    }
}
